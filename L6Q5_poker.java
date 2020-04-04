/***
*	27-03-2020
*
*	Lab 6:	Question 5
*
*	Description:
*	In Poker, a "full house" occurs when your five cards contain three of one card and two of another. 
*	For example: "K", "K", "5", "K", "5" would be a full house as there are 3 Kings and two 5's. Create a 
*	method that determines if a "hand" of 5 cards (which you can take in in your main method, stored in an 
*	array) is a full house. This method should be called fullHouseCheck. It will take an array as input and 
*	will return nothing. If it is a full house, you should print which card is the 3 of a kind, and which card 
*	is the two of a kind. Otherwise you should print "Not a full house".
*
*	Sample Input 1:		A, A, A, K, K
*
*	Sample Output 1:	3 of a kind: A
*    					2 of a kind: K
*
*   Sample Input 2:		3, J, 3, J, 3
*    
*	Sample Output 2:	3 of a kind: 3
*						2 of a kind: J
*
*	Sample Input 3:		10, J, 10, 10, 10
*
*	Sample Output 3: 	Not a full house
*
*	Algorithm:
*	Step 1: Take input from user into an array
*
*	Step 2:	Pass input to fullHouseCheck() method
*			A)	Create String[] cards which contains 13 cards from Ace to King
*			B)	Create an int[] count which will contain the number of times each card appears.
*			C)	A nested for-loop will iterate through the arrays.
*				i)		The outer-loop will manage the input[].
*				ii)		The inner-loop will manage the cards[].
*				iii)	If the input[i] matches cards[j], we update the value of count[j] by one
*			D)	We use a for-loop to check the values in count
*				i)		If count[i] ==3, we update a String threeK with an appropriate message and
*						set a = true.
*				ii)		If count[i] == 2, we update a String twoK with an appropriate message and
*						set b = true.
*			E)	We print statements depending on whether a and b are true
***/

import java.util.Scanner;

public class L6Q5_poker
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] input = new String[5];
		
		for(int i = 0; i < 5; i++)
		{	//Step 1:
			input[i] = scan.next();
		}
		
		fullHouseCheck(input);	//Step 2:
	}	//End main
	
	
	public static void fullHouseCheck(String[] input)
	{
		String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};	//A)
		int[] count = new int[13];	//B)
		
		for(int i = 0; i < 5; i++)	//C)
		{	//i)
			for(int j = 0; j < 13; j++)
			{	//ii)
				if(input[i].matches(cards[j]))
				{	//iii)
					count[j]++;
				}
			}	//End inner-loop
		}	//End outer-loop
		
		String threeK = new String("");
		String twoK = new String("");
		boolean a = false;
		boolean b = false;
		
		for(int i = 0; i < 13; i++)
		{	//D
			if(count[i] == 3)
			{	//i)
				threeK = "3 of a kind: " + cards[i];
				a = true;
			}
			else if(count[i] == 2)
			{	//ii)
				twoK = "2 of a kind: " + cards[i];
				b = true;
			}
		}	//End for-loop
		
		if(a == true && b == true)	//E)
		{
			System.out.println(threeK);
			System.out.println(twoK);
		}
		else
		{
			System.out.println("Not a full house");
		}
	}	//End fullHouseCheck()
}	//End class