import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//*******************************************
// Nathan Schnitzer
// Diff.java
// 1/21/19
// ACSL Contest #2 2019
//*******************************************


public class Diff 
{
	public static String firstAlgorithm(String s1, String s2)
	{
		StringTokenizer tokenizer = new StringTokenizer(s1);
		ArrayList<String> s1Words = new ArrayList<String>();
		String commonString = "";

		//tokenize s1
		while (tokenizer.hasMoreTokens())
		{
			s1Words.add(tokenizer.nextToken());
		}


		for (String s : s1Words)
		{
			if (s2.contains(s))
			{
				commonString = commonString + " " + s;
			}
		}

		return commonString;
	}

	public static String secondAlgorithm(String s1, String s2)
	{
		//Turn s2 into char arraylist
		ArrayList<Character> s2Arr = new ArrayList<Character>();
		String common = "";
		char[] temp = s2.toCharArray();
		for (char c : temp)
		{
			if (c == ' ')
			{
				continue;
			}
			s2Arr.add(c);
		}

		for (int i = 0; i < s1.length(); i++)
		{
			if (s2Arr.contains(s1.charAt(i)))
			{
				common += s1.charAt(i);
				/*
				System.out.println(s1.charAt(i));
				System.out.println(Arrays.deepToString(s2Arr.toArray()));
				System.out.println(s2Arr.indexOf(s1.charAt(i)));
				 */
				int lcv = s2Arr.indexOf(s1.charAt(i));
				for (int k = 0; k <= lcv; k++)
				{
					s2Arr.remove(0);
				}
			}

		}
		return common;

	}
}
