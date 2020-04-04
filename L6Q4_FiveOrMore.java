/***
*	27-03-2020
*
*	Lab 6:	Question 4
*
*	Description:
*	Write a Java program, called FiveOrMore that takes a String as user input. 
*	The program should then reverse every word in the String that has a length 
*	greater than or equal to five.
*
*	Sample Input: 	Just keep swimming
*	Sample Output: 	Just keep gnimmiws
*
*	Algorithm:
*	Step 1: Take input from user
*	
*	Step 2:	Pass input to fiveorMore() method
*			A)	Split input into String[] with regex of " "
*			B)	Using a for-loop, where an element has length > 5, reverse the element
*			C)	Replace the element in the array with the reversed version
*			D)	Return the array to main
*
*	Step 3:	Print the output array, adding back in whitespace
*
***/

import java.util.Scanner;

public class L6Q4_FiveOrMore
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);	//Step 1:
		String input = scan.nextLine();
		String[] output = fiveorMore(input);	//Step 2:
		
		for(int i = 0; i < output.length; i++)
		{	//Step 3:
			System.out.print(output[i] + " ");
		}
	}	//End main
	
	
	public static String[] fiveorMore(String input)
	{
		String[] a = input.split(" ");	//A)
		for(int i = 0; i < a.length; i++)
		{	//B)
			String temp = new String("");
			String y = a[i];
			if(y.length() >= 5)
			{
				for(int j = y.length() - 1; j >= 0; j--)
				{
					temp = temp + y.charAt(j);
				}
				a[i] = temp;	//C)
			}
		}	//End for-loop
		return a;	//D)
	}	//End fiveorMore()
}	//End class