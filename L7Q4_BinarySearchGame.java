/***
*	03-04-2020
*
*	Lab 7:	Question 4
*
*	Description:
*	In this Binary Search Guessing Game, The computer must check for the presence of an integer number 
*	in a provided range from start to end (inclusive). At the end of the game, the number is revealed 
*	along with the number of tries it took the computer to get the correct number. You should take the 
*	number being searched for from user input. The computer should use the binary search algorithm to 
*	solve this question.
*
*	NOTE: 			You are provided a range in which the number will be contained. 
*
*	Input:			n, where n is the number you will search for in the integer array provided.
*
*	Sample Input:	7
*
*	Output:			The number being searched for and the number of tries to find it
*
*	Sample Output:	The number is: 7
*   				It took 4 tries!
*
*
*	Algorithm:
*
*	Step 1:	Take parameters from user-input
*	
*	Step 2: Check target is valid
*	
*	Step 3: Perform a binary search of the target in the given range with an accumulator:
*
*			A)	First we search the middle of the range.
*
*			B)	If the middle value is greater than the target, we search the lower subrange.
*
*			C) If the middle value is less than the target, we search the higher subrange.
*
*			D) If the middle value equals the target, we print the number of iterations and the target value.
*
*/

import java.util.Scanner;
public class L7Q4_BinarySearchGame
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		int target = scan.nextInt();
		
		scan.close();
		
		if(target < start || target > end)
		{	//Step 2:
			System.out.println("Target is outside range: " + "[" + start + ", " + end + "]");
		}
		else
		{	//Step 3:
			bSearchG(start, end, target);
		}
		
	}	//End main
	
	public static void bSearchG(int start, int end, int target)
	{	//Step 3:
		int mid = 0, tries = 0;
		boolean found = false;
		
		while(start <= end && !found)
		{	
			tries++;
			mid = (start + end) / 2;	//A)
			
			if(mid > target)
			{	//B)
				end = mid -1;
			}
			else if(mid < target)
			{	//C)
				start = mid + 1;
			}
			else
			{	//D
				System.out.println("The number is: " + target);
				System.out.println("It took " + tries + " tries!");
				found = true;
			}
		}	//End while
		
	}	//End bSearchG()
	
}	//End class