/***
*	03-04-2020
*
*	Lab 7:	Question 5
*
*	Description:
*	Write a Java method called uniqueSort which, given an array of integers:
*		*	Removes all duplicate numbers
*		*	Sorts the array from smallest to largest
*		*	Returns the new array
*
*	You should then print your final array in the main method.
*
*	NOTE: 				The first input value is the "size" of your array. 
*						All remaining inputs are values in your array.
*
*	Sample Input 1: 	4 1 2 4 3
*	Sample Output 1: 	1 2 3 4
*
*	Sample Input 2:		9 1 4 4 4 4 3 2 1 2
*	Sample Output 2:	1 2 3 4
*
*	Sample Input 3:		7 6 7 6 4 3 2 1
*	Sample Output 3:	1 2 3 6 7
*
*	Algorithm:
*
*	Step 1: Take in integer array a from user input.
*
*	Step 2: Pass a to uniqueSort() method.
*
*	Step 3:	Remove duplicate elements:
*			A) A nested for-loop will compare a given array element against the remaining elements:
*				i)		Set isDup to false each time the outer-loop begins.
*				ii)		If a[i] matches a[j] we set isDup to true and break, moving to the i + 1 element.
*				iii)	If isDup remains false we add a[i] to temp[count] and increment count by one.
*
*	Step 4: Add unique elements from temp to new array with size count.
*	
*	Step 5:	Sort the new array.
*.
*	Step 6: Return the array to main.
*
*	Step 7: Print the array.
*
***/
import java.util.Scanner;
public class L7Q5_UniqueSorting
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] a = new int[size];
		for(int i = 0; i < size; i++)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		
		int[] b = uniqueSort(a, size);	//Step 2 and 6:
		
		for(int i = 0; i < b.length; i++)
		{	//Step 7:
			System.out.print(b[i] + " ");
		}
	}	//End main
	
	public static int[] uniqueSort(int[] a, int size)
	{	//Step 3:
		boolean isDup = false;
		int count = 0;
		int[] temp = new int[size];
		for(int i = 0; i < size; i++)
		{	//A)
			isDup = false;	//i)
			for(int j = i + 1; j < size; j++)
			{
				if(a[i] == a[j])
				{	//ii)
					isDup = true; break;
				}
			}	//End inner-loop
			if(!isDup)
			{	//iii)
				temp[count++] = a[i];
			}
		}	//End remove duplicates outer-loop
		
		
		int[] b = new int[count];
		for(int i = 0; i < count; i++)
		{	//Step 4:
			b[i] = temp [i];
		}
		
		int x = b[0];	
		boolean isSorted = true;
		for(int i = 1; i < count; i++)
		{	//Step 5: 
			for(int j = 0; j < count - i; j++)
			{
				if(b[j] > b[j + 1])
				{
					x = b[j];
					b[j] = b[j + 1];
					b[j + 1] = x;
					isSorted = false;
				}
				else
				{
					isSorted = true;
				}
			}	//End inner loop
			if(isSorted)
			{
				break;
			}
		}	//End bubble sort
		return b;	//Step 6:
	}	//End uniqueSort()
}	//End class