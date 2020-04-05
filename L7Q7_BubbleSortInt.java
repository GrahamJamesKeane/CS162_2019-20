/***
*	03-04-2020
*
*	Lab 7:	Question 7
*
*	Description:
*	Given an array of Integers, use Bubble sort to sort the array by the number of 
*	digits in the Integer (from largest to smallest). If there are two Integers with 
*	the same number of digits, sort the Integers by value from smallest to largest. 
*	The array will be provided by user input with the first number being how many 
*	Integers there are in the array.
*
*	Sample Array 1:		5 78 987 2 7632 12398
*
*	Sample Output 1:	12398 7632 987 78 2
*
*
*	Sample Array 2:		6 77 23 5 1 7 101
*
*	Sample Output 2:	101 23 77 1 5 7
*
*	Algorithm:
*
*	Step 1:	Create array from user input. -> makeArray() method
*
*	Step 2:	Sort the array by number of digits. Elements of equal length are evaluated from smallest to largest. -> bSortI() method
*	
*			A)	Cast the adjacent pair of elements to Strings and compare their lengths:
*
*				i)	If the first String is shorter than the second, then we swap the parent elements in the array.
*
*				ii)	If the Strings are the same length, we compare the numerical values of the parent elements:
*
*					a)	If the first element is larger than the second, we swap the elements.
*
*			B)	If isSorted is true after 1st iteration, break out of bubblesort. -> array is already sorted
*
*			C)	Return the array.
*
*	Step 3:	Print the array. -> printArray() method
*
***/

import java.util.Scanner;

public class L7Q7_BubbleSortInt
{
	public static void main(String[] args)
	{
		int[] a = makeArray();	//Step 1:
		
		bSortI(a);	//Step 2:
		
		printArray(a);	//Step 3:
		
	}	//End main()
	
	
	public static int[] makeArray()
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			a[i] = scan.nextInt();
		}
		
		scan.close();
		
		return a;
		
	}	//End makeArray()
	
	
	public static int[] bSortI(int[] a)
	{	//Step 2:
		int t = 0;
		boolean isSorted = false;
		
		for(int i = 1; i < a.length; i++)
		{
			for(int j = 0; j < a.length - i; j++)
			{	//A)
				String s1 = "" + a[j];
				String s2 = "" + a[j + 1];
				if(s1.length() < s2.length())
				{	//i)
					isSorted = false;
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
				else if(s1.length() == s2.length())
				{	//ii)
					if(a[j] > a[j + 1])
					{
						isSorted = false;
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
				else
				{
					isSorted = true;
				}
			}	//End inner-loop
			
			if(isSorted)
			{	//B)
				break;
			}
		}	//End outer-loop
		
		return a;	//C)
		
	}	//End bSortI()
	
	
	public static void printArray(int[] a)
	{	//Step 3:
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}	//End printArray()
	
}	//End class