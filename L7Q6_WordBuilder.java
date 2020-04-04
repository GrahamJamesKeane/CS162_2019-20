/***
*	03-04-2020
*
*	Lab 7:	Question 6
*
*	Description:
*	Given an array of letters and an array of positions, use Bubble sort to sort the arrays to build the word. 
*	To find out where you put the letters, you will use the positions contained in the second given array. 
*	The code for the arrays is given to you, please DO NOT CHANGE THIS.
*
*	Sample Arrays 1:	letters[] = {'l', 'o', 'e', 'h', 'l'};
*   					positions[] = {2, 4, 1, 0, 3};
*
*	Sample Output 1:	hello
*
*	Algorithm:
*
*	Step 1:	Pass letters and positions to wordB() method.
*
*	Step 2: Sort positions array, as elements in positions are switched, switch the corresponding elements in letters.
*
*	Step 3:	Build a String from letters.
*
*	Step 4: Return te String to main().
*
*	Step 5: Print the String.
*/

public class L7Q6_WordBuilder
{
	public static void main(String[] args)
	{	//DO NOT CHANGE THE ARRAY DECLARATIONS
		char[] letters = {'l', 'o', 'e', 'h', 'l'};
		int[] positions = {2, 4, 1, 0, 3};
		System.out.println(wordB(letters, positions));	//Step 1 & 5:
	}	//End main
	
	
	public static String wordB(char[] letters, int[] positions)
	{
		int t1 = 0;
		char t2 = ' ';
		String s = new String("");
		for(int i = 1; i < positions.length; i++)
		{	//Step 2:
			for(int j = 0; j < positions.length - i; j++)
			{
				if(positions[j] > positions[j + 1])
				{
					t1 = positions[j];
					positions[j] = positions[j + 1];
					positions[j + 1] = t1;
					
					t2 = letters[j];
					letters[j] = letters[j + 1];
					letters[j + 1] = t2;
				}
			}
		}	//End sort
		
		for(int i = 0; i < letters.length; i++)
		{	//Step 3:
			s += letters[i];
		}	//End stringbuilder
		
		return s;	//Step 4:
	}	//End wordB()
}	//End class

