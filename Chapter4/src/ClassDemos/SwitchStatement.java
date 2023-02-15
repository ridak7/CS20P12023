
/*

Program: SwitchStatement.java          Last Date of this Revision: 

Purpose: 

Author: Your Name, 
School: CHHS
Course: Computer Science 20
 

*/

package ClassDemos;
import java.util.Scanner;

public class SwitchStatement 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//Getting ready for user input
		
		System.out.println("Please enter a number for the day of the week (1-7) in order to get a name ");//display message for user
	
		int day = userinput.nextInt();//record the user input
		
		switch(day) //switch statement determines which day of the week the user chooses
		{
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednesday");break;
			
			default:System.out.println("Please choose number between 1-7");//helps user stay between 1-7
		}
	}

}
