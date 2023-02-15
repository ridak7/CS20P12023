
/*

Program: InClassDemo2.java          Last Date of this Revision: February 14, 2023

Purpose: 

Author: Your Name, 
School: CHHS
Course: Computer Science 20
 

*/


package ClassDemos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InClassDemo2 
{

	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.0");
		
		int x = 5;
		double y = 6.7943349459;
		char m = 'A';
		String name = "Vigor";
		
		final double PI = 3.14;
		
	/*	
	System.out.println("Enter an integer: ");//Prompting for an int
	int numEntered = userinput.nextInt();//Recording an int

	System.out.println("Is the integer you've entered: "+ numEntered);
	System.out.println("Please type Y/N");
	char ans = userinput.next().charAt(0);
	
	if(ans == 'Y')
	{
		System.out.println("Great! We will move on.");
	}
	else
	{
		System.out.println("Sorry!");
	}
	*/
	System.out.println(dc.format(y));
	
		

	}

}
