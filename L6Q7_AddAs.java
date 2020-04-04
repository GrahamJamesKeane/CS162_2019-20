/***
*	27-03-2020
*
*	Lab 6:	Question 7
*	
*	Description:
*	Write a recusrive method (no loops), called moreAs, which takes a String. 
*	This method should add in 2 more a's every time an a is found in the String.
*
*	Sample Input 1:		catalogue 
*
*	Sample Output 1:	caaataaalouge
*
*	Sample Input 2:		anagram
*
*	Sample Output 2:	aaanaaagraaam
*
*	Algorithm:
*	Step 1:	Take input from user
*
*	Step 2: Pass String to moreAs() method 
*			A)	Base Case:	String length <= 1
*				i)	char is 'a' -> return 'aaa'
*				ii)	char is not 'a' -> return char
*			B) Recursive case:	
*				i)	Current char is 'a' -> return moreAs, plus 'aaa'
*				ii)	Current char is not 'a' -> return moreAs, plus char
*			C)	Reductive Step:	Return a substring from index zero up to but excluding the current char within moreAS
*
*	Step 3: Print the returned String
*	
***/

import java.util.Scanner;

public class L6Q7_AddAs
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println(moreAs(input));	//Step 2 & 3:
	}	//End main()
	
	
	public static String moreAs(String input)
	{
		String s = input.substring(input.length() - 1);
		
		if(input.length() <= 1)
		{	//A)
			if(s.equals("a"))
			{	//i)
				return "aaa";
			}
			else
			{	//ii)
				return s;
			}
		}
		else if(s.equals("a"))
		{	//Bi) & C)
			return moreAs(input.substring(0, input.length() - 1)) + "aaa";
		}
		else
		{	//Bii) & C)
			return moreAs(input.substring(0, input.length() - 1)) + s;
		}
	}	//End moreAs()
}	//End class