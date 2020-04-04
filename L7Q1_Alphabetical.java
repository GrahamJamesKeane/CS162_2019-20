/***
*	03-04-2020
*
*	Lab 7: Question 1
*
*	Description;
*	Write a java program that takes in a String. Use Bubble sort to sort the 
*	letters of the String into alphabetical order. Print the alphabetically 
*	ordered String out.
*
*	Sample Input 1:		hello 
*	Sample Output 1:	ehllo
*
*	Algorithm:
*
*	Step 1:	Take in user input as String
*
*	Step 2: Construct an array from characters of the String
*
*	Step 3: Sort the array
*
*	Step 4: Construct a String from the sorted array and print
*
***/

import java.util.Scanner;

public class L7Q1_Alphabetical
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String[] a = makeArray(input);
		bSort(a);
		makeString(a);
	}	//End main
	
	
	public static String[] makeArray(String input)
	{	//Step 2:
		input = input.toLowerCase();	//Make any input lowercase to avoid issues with .compareTo() method's evaluation
		String[] a = new String[input.length()];
		for(int i = 0 ; i < a.length; i++)
		{
			a[i] = "" + input.charAt(i);
		}
		return a;
	}	//End makeArray()
	
	
	public static void bSort(String[] a)
	{	//Step 3:
		String t = a[0];
		boolean isSorted = true;
		for(int i = 0; i < a.length - 1; i++)
		{ 
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i].compareTo(a[j]) > 0)
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
					isSorted = false;
				}
			}	//End inner-loop
			if(isSorted) return;
		}	//End outer-loop
	}	//End bSort()
	
	
	public static void makeString(String[] a)
	{	//Step 4:
		String s = new String("");
		for(int i = 0; i < a.length; i++)
		{
			s += a[i];
		}	
		System.out.println(s);
	}	//End makeString()
}//End class