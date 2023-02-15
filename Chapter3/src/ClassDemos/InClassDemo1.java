package ClassDemos;

import java.util.Scanner;

public class InClassDemo1 
{

	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);
		
		int age;		
		double salary;
		String name;
		char FirstInitial;
		
		System.out.println("Please enter your full name: ");
		
		name = userinput.nextLine();
		
		
		System.out.println("Please enter your age: ");
		
		age = userinput.nextInt();
		
					
	System.out.println("The name you've entered is: " + name +
				"and your age is: " + age);
		
		
		

	}

}
