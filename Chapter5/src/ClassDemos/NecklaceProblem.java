package ClassDemos;

import java.util.Scanner;

public class NecklaceProblem 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Declaration area
		int numStart1, numStart2;
		int nextNum, prevNum, lastNum;
		
		//Prompt the user to enter the first number
		System.out.println("Enter the first starting number: ");
		numStart1 = input.nextInt();//Record first number
		
		//Prompt the user to enter the second number
		System.out.println("Enter the second starting number: ");
		numStart2 = input.nextInt();//Record second number	
		
		System.out.println(numStart1 + " " + "\n" + numStart2 + " ");
		prevNum = numStart2;//Assign prevNum to be second number
		nextNum = (numStart1 + numStart2) % 10;//Take the remainder
		System.out.println(nextNum + " ");
		
		do
		{
			lastNum = nextNum;
			nextNum = (prevNum + nextNum) % 10;
			prevNum = lastNum;
			System.out.println(nextNum + " ");			
			
		}while(!((prevNum == numStart1) && (nextNum == numStart2)));
		
		System.out.println();
		

	}

}
