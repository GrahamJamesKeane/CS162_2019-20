/***
*	27-03-2020
*
*	Lab 6:	Question 2
*
*	Description:
*	Write a program which contains a method called commaNumbers. This method takes one input to 
*	represent a number (an integer). The method should return a String to represent the same 
*	number with appropriate commas in place.
*
*	Sample Input 1:		1000
*
*	Sample Output 1:	1,000
*
*
*	Sample Input 2:		100000
*
*	Sample Output 2:	100,000
*
*	Sample Input 3:		20
*
*	Sample Output 3:	20
*
*	Algorithm:
*	Step 1:	Take input from user
*
*	Step 2: Pass input to commaNumers() method
*			A)	We create a new String, called output to contain the modified input String
*			B)	Check String is longer than three characters. We won't place a comma in a number less than 1000
*			C)	With a for-loop we iterate from the end of the String towards the start. 
*				i)		If we find that int pos is not zero and is divisble by 3 then we add a comma between the character at
*				    	a[i] and the remainder of the String.
*				ii)		Else we append the character a[i] without a comma to the remainder of the String.
*				iii) 	We update pos.
*			D)	Return output to main
*
*	Step 3:	Print the result
*
***/

import java.util.Scanner;

public class L6Q2_numbersWithCommas
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(commaNumbers(input));
	}	//End main
	
	public static String commaNumbers(String input)
	{
		String output = new String("");
		if(input.length() <= 3)
		{
			return input;
		}
		else
		{
			String[] a = input.split("");
			int pos = 0;
			for(int i = a.length - 1; i >=0; i--)
			{
				if(pos != 0 && pos % 3 == 0)
				{
					output = a[i] + "," + output;
				}
				else
				{
					output = a[i] + output;
				}
				pos++;
			}	//End for
		}	//End outer else
			return output;
	}	//End commaNumbers()
}	//End class