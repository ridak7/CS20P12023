package ClassDemos;

import java.util.Scanner;

public class AccountSetup 
{

	public static void main(String[] args) 
	{
		String userName, password;//Declared two variables
		Scanner input = new Scanner(System.in);
		
		//Get user name
		System.out.println("Enter a user name: ");
		userName = input.nextLine();
		userName = userName.toLowerCase();
		
		//Get password
		System.out.println("Enter a password that is at least 8 characters: ");
		password = input.next();

		while(password.length() < 8)
		{
			System.out.println("Enter a password that is at least 8 characters: ");
			password = input.next();
		}
		
		password = password.toLowerCase();
		System.out.println("Your name is "+ userName + " and your password is " + password);

	}

}
