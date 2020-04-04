/***
*	03-04-2020
*
*	Lab 7:	Question 2:
*	Description:
*	Given two Strings, s1 and s2, write a Java program that determines if s2 is 
*	an anagram of s1 using Bubble sort. If it is, print s1 in alphabetical order. 
*	If it is not, print s1 and s2 in alphabetical order.
*
*	Sample Input 1:		anagram
*						nagaram
*
*	Sample Output 1:	aaagmnr
*
*	Sample Input 2:		cat
*						mat
*
*	Sample Output 2:	act
*						amt
*
*	Algorithm:
*
*	Step 1:	Take input Strings from user
*	
*	Step 2:	Create arrays from input Strings
*
*	Step 3:	Sort the arrays
*
*	Step 4:	Determine if the arrays have the same contents -> Are the Strings anagrams?
*
*	Step 5:	If arrays match, we construct and print String from a, else also construct and print String from b
*
***/


import java.util.Scanner;
public class L7Q2_Anagram
{
	public static void main(String[] args)
	{	//Step 1:
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		scan.close();
		
		//Step 2:
		String[] a = makeArray(s1);
		String[] b = makeArray(s2);
		
		//Step 3:
		bSort(a);
		bSort(b);
		
		//Step 4:
		boolean flag = isAnagram(a, b);
		
		//Step 5:
		makeString(a, b, flag);
	}	//End main()
	
	
	public static String[] makeArray(String y)
	{	//Step 2:
		y = y.toLowerCase();	//Make any y lowercase to avoid issues with .compareTo() method's evaluation
		String[] x = new String[y.length()];
		for(int i = 0; i < x.length; i++)
		{
			x[i] = "" + y.charAt(i);
		}
		return x;
	}	//End makeArray()
	
	
	public static void bSort(String[] a)
	{	//Step 3:
		String t = a[0];
		boolean isSorted = true;
		for(int i = 1; i < a.length; i++)
		{ 
			for(int j = 0; j < a.length - i; j++)
			{
				if(a[j].compareTo(a[j + 1]) > 0)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					isSorted = false;
				}
			}	//End inner-loop
			if(isSorted) return;
		}	//End outer-loop
	}	//End bSort()
	
	
	public static boolean isAnagram(String[] a, String[] b)
	{	//Step 4:
		boolean flag = true;
		if(a.length == b.length)
		{
			for(int i = 0; i < a.length; i++)
			{
				if(a[i].compareTo(b[i]) != 0)
				{
					flag = false; break;
				}
			}
		}	//End if
		else
		{
			flag = false;
		}
		return flag;
	}	//End isAnagram()
	
	
	public static void makeString(String[] a, String[] b, boolean flag)
	{	//Step 5:
		if(flag)
		{
			String o1 = new String("");
			for(int i = 0; i < a.length; i++)
			{
				o1 += a[i];
			}	
			System.out.println(o1);
		}
		else
		{
			String o1 = new String("");
			String o2 = new String("");
			for(int i = 0; i < a.length; i++)
			{
				o1 += a[i];
				o2 += b[i];
			}	
			System.out.println(o1);
			System.out.println(o2);
		}
	}	//End makeString()
}	//End class