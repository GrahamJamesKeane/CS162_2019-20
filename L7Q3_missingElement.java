/***
*	03-04-2020
*
*	Lab 7:	Question 3
*	
*	Description:
*	Given an of numbers, use Bubble sort to sort the array. The array contains 
*	a group of consecutive numbers, however, one number is missing. Once the 
*	array is sorted, find and print the missing number. You may assume all numbers 
*	are between the first sorted element and the last sorted element. The code for 
*	the array is given to you, please DO NOT CHANGE THIS.
*
*	Sample Arrays 1:	{1, 4, 7, 9, 3, 6, 8, 5}
*  
*	Sample Output 1:	2
*	
*
*	Algorithm:
*
*	Step 1:	Sort the array --> bSort() method
*
*	Step 2:	Determine the missing element in the sequence --> missE() method
*			Since we know the array contains a group of consecutive numbers,
*			we can find the missing value by iterating through the sequence
*			and comparing adjacent values as in the bubblesort method.
*
*			If for a given pair, i and j, where i is exactly onde index position
*			less than j, we find that j != i + 1, then j is not the next conecutive
*			number and we have found the missing value in the sequence.
*
*	Step 3: Print the missing number: x = i + 1, where x is the missing number and i is the number preceding x.
*
***/

public class L7Q3_missingElement
{
	public static void main(String[] args)
	{
		//DO NOT CHANGE THE ARRAY DECLARATION
		int[] missing = {1, 4, 7, 9, 3, 6, 8, 5};
		
		bSort(missing);
		missE(missing);
	}	//End main()
	
	
	public static void bSort(int[] missing)
	{	//Step 3:
		int t = 0;
		boolean isSorted = true;
		for(int i = 1; i < missing.length; i++)
		{ 
			for(int j = 0; j < missing.length - i; j++)
			{
				if(missing[j] > missing[j + 1])
				{
					t = missing[j];
					missing[j] = missing[j + 1];
					missing[j + 1] = t;
					isSorted = false;
				}
			}	//End inner-loop
			if(isSorted) return;
		}	//End outer-loop
	}	//End bSort()
	
	
	public static void missE(int[] missing)
	{
		for(int i = 0; i < missing.length - 1; i++)
		{
			if(missing[i + 1] != (missing[i] + 1))
			{
				System.out.println(missing[i] + 1); break;
			}
		}
	}	//End missE()
}	//End calss