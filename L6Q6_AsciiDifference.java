/***
*	27-03-2020
*
*	Lab 6:	Question 6
*
*	Description:
*	Write a Java program, called AsciiDifference that contains a static method called difference() 
*	that accepts two Strings as the input parameters and returns the difference in the sum of ASCII 
*	values of the two Strings as an integer value. The input parameters should be read in from the 
*	user in the main method and passed to the difference() method. The main method should print 
*	returned integer to the screen.
*
*	Sample Input:	ireland
*					IRELAND
*
*
*	Sample Output:	224
*
*	Explanation:
*	String s1 = "ireland"; String s2 = "IRELAND"; 
*	The sum of ASCII Values for s1 = 735 The sum of ASCII Values for s2 = 511 
*	The difference between s1 and s2 = 224
*
*	Algorithm:
*	Step 1:	Two user input as two separate Strings
*
*	Step 2: Pass Strings to difference() method
*			A):	Using a for-loop, convert each character of a String to its ascii value and sum the total
*			B)	Compute the difference between these sums
*			C)	Return the result to main
*
*	Step 3: Print the result
*
***/

import java.util.Scanner;

public class L6Q6_AsciiDifference
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		scan.close();
		System.out.println(difference(s1, s2));	//Step 2 & 3:
	}	//End main
	
	
	public static int difference(String s1, String s2)
	{
		int x1 = 0, x2 = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{	//A)
			x1 += (int)s1.charAt(i);
		}
		
		for(int i = 0; i < s2.length(); i++)
		{	//A)
			x2 += (int)s2.charAt(i);
		}
		return (x1 - x2);	//B) & C)
	}	//End difference()
}	//End main