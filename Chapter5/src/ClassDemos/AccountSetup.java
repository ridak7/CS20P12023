package ClassDemos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountSetup 
{

	public static void main(String[] args) 
	{
		String userName, password;//Declared two variables
		Scanner input = new Scanner(System.in);
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		//Get user name
		System.out.println("Enter a user name: ");
		userName = input.nextLine();//assigned user name value from keyboard
		userName = userName.toLowerCase();//Convert user name to lowercase
		
		//Get password
		System.out.println("Enter a password that is at least 8 characters: ");
		password = input.next();//assign password value from the keyboard

		while(password.length() < 8)//Check if password is at least 8 characters
		{
			//Ask again for user to enter a password that is at least 8 characters
			System.out.println("Enter a password that is at least 8 characters: ");
			password = input.next();//Store the new password
		}
		
		
		password = password.toLowerCase();//Convert password to lowercase
		
		//Display back to the user the user name and password they've entered
		System.out.println("Your name is "+ userName + " and your password is " + password);

	}

}
