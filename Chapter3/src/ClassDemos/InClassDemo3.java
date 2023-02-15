
/*

Program: InClassDemo3.java          Last Date of this Revision: February 15, 2023

Purpose: 

Author: Your Name, 
School: CHHS
Course: Computer Science 20
 

*/
package ClassDemos;

import java.util.Scanner;

public class InClassDemo3 {

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		int age;//Declaration for integer number
		double salary; //decimal number
		String name; //More than one character
		char firstInitial;
		
		System.out.print("Please enter your full name: ");
		name = userinput.next();
		
		System.out.print("Please enter your age: ");
		age = userinput.nextInt();
		
		System.out.print("Please enter your salary: ");
		salary = userinput.nextDouble();
		
		System.out.print("The full name you've typed is: " + name);
		System.out.print("The age you've typed is: " + age);
		System.out.print("Your salary is: " + salary);
	}

}
