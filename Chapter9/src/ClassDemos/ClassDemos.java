package ClassDemos;

import java.util.Scanner;

public class ClassDemos 
{

	public static void main(String[] args) 
	{
		//int[] courses;//Declare are array
		//courses = new int[5];//Initialization
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of courses: ");
		int c = input.nextInt();
		
		int[] courses = new int[c];
		
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println("Enter grade for course: ");
			courses[i] = input.nextInt();
		}
		
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println(courses[i]);
		}
		//

	}

}
