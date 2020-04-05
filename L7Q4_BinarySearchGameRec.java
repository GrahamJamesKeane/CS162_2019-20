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
*	Step 3: Perform a recursive binary search of the target in the given range with an accumulator:
*
*			A)	Increment count by one.
*
*			B)	We set mid as the average of start plus the difference of end and start
*
*			C)	The base case is min equals target and we return count.
*
*			D)	If mid is greater than the target, we search the lower subrange by returning a recursive call to RbSearchG with
*				start, end = mid -1, target and count.
*
*			E)	If mid is less than target, we search the higher subrange by returning a recursive call to RbSearchG with
*				start = mid + 1, end, target and count.
*
*	Step 4:	Print the result
*
*/

import java.util.Scanner;
public class L7Q4_BinarySearchGameRec
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
			int count = 0;
			int tries = RbSearchG(start, end, target, count);
			
			if(tries > 0)
			{	//Step 4:
				System.out.println("The number is: " + target);
				System.out.println("It took " + tries + " tries!");
			}
		}	//End else
		
	}	//End main
	
	
	public static int RbSearchG(int start, int end, int target, int count)
	{	//Step 3:
		count++;	//A)
		if(end >= start)
		{	
			int mid = start + (end - start) / 2;	//B)
			if(mid == target)
			{	//C)
				return count;
			}
			else if(mid > target)
			{	//D)
				return RbSearchG(start, (mid - 1), target, count);
			}
			else
			{	//E)
				return RbSearchG((mid + 1), end, target, count);
			}
		}
		else
		{
			return -1;
		}
		
	}
}	//End class