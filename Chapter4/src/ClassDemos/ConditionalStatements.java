
/*

Program: ConditionalStatements.java          Last Date of this Revision: 

Purpose: 

Author: Your Name, 
School: CHHS
Course: Computer Science 20
 

*/

package ClassDemos;
import java.util.Scanner;

public class ConditionalStatements 
{

	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);//Getting ready for user input
		
		String secretW = "Calgary";//initialize the secret word
		
		String guess;//declaring a space for user to guess
		
		System.out.println("What is the secret word? ");//display message for user
		
		guess = userinput.next(); //record the user input
	
		if(guess.equalsIgnoreCase(secretW))//check if the two words are equal
		{
			System.out.println("Correct!");//output correct if they are equal
		}
		else
		{
			System.out.println("You've guessed it incorrectly");//display message if they did not guess the secret word
		}
		
	
		
		

	}

}
/* Screen Dump
 
  What is the secret word? 
EA
You've guessed it incorrectly



  
  
 
 */


