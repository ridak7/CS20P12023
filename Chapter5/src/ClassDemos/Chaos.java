package ClassDemos;

import java.util.Scanner;

public class Chaos 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double x;//Declare an x variable to hold a decimal number
		
		System.out.println("Enter the starting value between 0 and 1:");
		
		x = input.nextDouble();
		
		for(int i = 0; i < 50; i++)
		{
			x = 2 * x * (1 - x);
			System.out.println(x);
		}
		
		System.out.println("Program is done!");

	}

}
