/*

Program: NestedIf.java          Last Date of this Revision: February 22, 2023

Purpose: To calculate the stage associated with an age.

Author: Your Name, 
School: CHHS
Course: Computer Programming 20
 

*/

package ClassDemos;

import java.util.Scanner;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		int age; //declaring a space for age
		
		Scanner input = new Scanner(System.in);//Responsible for user input

		//Obtain age value from the user
		
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		
		//Determine stage associated with age
		
		if(age <= 5)
		{
			System.out.println("Toddler");
		}
		else
		{
			if(age <= 10)
			{
				System.out.println("Child");
			}
			else
			{
				if(age <=12)
				{
					System.out.println("Preteen");
				}
				else
				{
					if(age <= 18)
					{
						System.out.println("Teen");
					}
					else
					{
						System.out.println("Adult");
					}
				}
			}
			
		}
		

	}

}
