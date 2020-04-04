/**
*	Lab 6:	Question 3
*
*	Description:
*	The mexican wave is a famous motion that is often perfomed by a crowd at a sporting event. 
*	The motion involves an effect resembling a moving wave produced by successive sections of 
*	the crowd in a stadium standing up, raising their arms, lowering them, and sitting down again.
*	Your task for this program is to simulate a "mexican wave" on a String. Within your program, 
*	create a method called wave which takes one String as an input. This method should return an 
*	array of stages in the wave.
*
*	For example, with the word "hello", your mexican wave will be ["Hello", "hEllo", "heLlo", helLo", hellO"]. 
*	When your array has been created, print out its contents one word per line.
*
*	NOTE: Spaces are ignored in the mexican wave.
*
*	Sample Input 1:		hello
*	Sample Output 1:	Hello
*						hEllo
*    					heLlo
*   					helLo
*   					hellO
*
*	Sample Input 2:		hello world
*	Sample Output 2:	Hello world
*						hEllo world
*						heLlo world
*						helLo world
*						hellO world
*						hello World
*						hello wOrld
*						hello woRld
*						hello worLd
*						hello worlD
*
*	Algorithm:
*	Step 1:	Take input from user
*
*	Step 2: Pass input to wave() method which returns a String array to output
*			A)	Make sure string is lowercase
*			B)	Create String array to store each word in the wave pattern
*			C)	Within a for-loop we pass input to a String temp each iteration
*				i)		Moving from left to right we select char at position i
*				ii)		Assuming the characters are letters and whitespace, if charAt(i) is not a space we add it's uppercase variant to a second char variable
*				iii)	We construct a temp String according to the value of i. 
*						1)	At position 0 we append c2 at the left and the remaining string to the right. 
*						2)	At positions between the first and last index we append in the middle.
*						3)	At the last index we append to right.
*				iv)		Finally, we send the temp String to output[i] and repeat.
*			D)	Output is returned to main
*
*	Step 3:	We print ouput using a for-each loop
*						
*
**/

import java.util.Scanner;

public class L6Q3_mexicanWave
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);	//Step 1:
		String input = scan.nextLine();
		scan.close();
		String[] output = wave(input);	//Step 2:
		
		for(String y: output)
		{	//Step3:
			System.out.println(y);
		}
	}	//End main
	
	
	public static String[] wave(String input)
	{
		input = input.toLowerCase();	//A)
		int size = input.length();
		String[] output = new String[size];	//B)
		
		for(int i = 0; i < size; i++)
		{	//C)
			String temp = input;
			char c1 = temp.charAt(i);	//i)
			int x = 0;
			char c2 = ' ';
			
			if(c1 != ' ')
			{	//ii)
				x = c1 - 32;
				c2 = (char)x;
			}
			
			if(i == 0)	//iii)
			{	//1)
				temp = c2 + temp.substring(1);
			}
			else if(i > 0 && i < size - 1)
			{	//2)
				temp = temp.substring(0, i) + c2 + temp.substring(i + 1);
			}
			else
			{	//3)
				temp = temp.substring(0, i) + c2;
			}
			output[i] = temp;	//iv)
		}	//End for-loop
		return output;	//D)
	}	//End wave()
}	//End class