//*************************************************
// Nathan Schnitzer
// DiffDriver.java
// 1/21/19
// ACSL Contest #2 2019
//*************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DiffDriver 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner scan = new Scanner(new File("src/inputs.txt"));
		//Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine())
		{
			String in1 = scan.nextLine();
			String in2 = scan.nextLine();

			String commonOne = Diff.firstAlgorithm(in1, in2);
			String commonTwo = Diff.firstAlgorithm(in2, in1);

			System.out.println(Diff.secondAlgorithm(commonOne, commonTwo));
		}
	}

}
