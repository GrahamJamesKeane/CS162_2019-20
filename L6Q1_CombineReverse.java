/***
*	Lab 6:	Question 1
*
*	Description:
*	Write a Java program, called CombineReverse that contains a static method called combine() 
*	that accepts a single non-negative integer as its parameter and returns the integer combined 
*	with the integer in reverse. The input parameter should be read in from the user in the main 
*	method and passed to the combine() method. The main method should print the combined integer 
*	to the screen. If the input is negative an error message should print to the screen stating 
*	'Not a valid entry!'
*
*	Sample Input:	427
*
*	Sample Output:	427724
*
*
*	Algorithm:
*	Step 1: Take input from user and store in int input.
*	Step 2: Confirm input is non-negative, else print an appropriate statement.
*	Step 3: Pass input to the combine() method.
*			A) Cast the input to string.
*			B) Split the String into individual characters and pass to an array.
*			C) Add the reversed array contents to the end of the original string.
*			D) Return the String.
*	Step 4: Print the modified String.
**/

import java.util.Scanner;

public class L6Q1_CombineReverse
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if(input < 0)
		{
			System.out.println("Not a valid entry!");
		}
		else
		{
			System.out.println(combine(input));
		}
	}	//End main
	
	
	public static String combine(int input)
	{
		String s = "" + input;	//Convert int to String
		String[] a = s.split("");	//Split the String into individual characters and pass to an array
		for(int i = a.length - 1; 1 >= 0; i--)
		{
			s += a[i];
		}
		return s;
	}	//End combine()
}	//End class