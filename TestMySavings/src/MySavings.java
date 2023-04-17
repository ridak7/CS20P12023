

 import java.io.*;
 import java.util.Scanner;
 import java.text.NumberFormat;

 
 public class MySavings {

	
	public static PiggyBank load() 
	{
		File bankFile = new File("piggybank.dat");
		PiggyBank money = new PiggyBank();

		try {
			/* read objects */
			FileInputStream in = new FileInputStream(bankFile);
			ObjectInputStream readBank = new ObjectInputStream(in);
			money = (PiggyBank)readBank.readObject();
			readBank.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		return(money);
	}


	/**
	 * Stores the PiggyBank object to a file
	 * pre: none
	 * post: The PiggyBank object has been stored on a file
	 */
	public static void store(PiggyBank money) {
		File bankFile = new File("piggybank.dat");

		try {
			/* write objects */
			FileOutputStream out = new FileOutputStream(bankFile);
			ObjectOutputStream writeBank = new ObjectOutputStream(out);
			writeBank.writeObject(money);
			writeBank.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
		}
	}


	public static void main(String[] args) {
		final double PENNY = .01;
		final double NICKEL = .05;
		final double DIME = .10;
		final double QUARTER = .25;
		PiggyBank myBank = new PiggyBank();
		Scanner input = new Scanner(System.in);
		int choice;
		double amount;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		/* load bank information if available */
		File bankFile = new File("piggybank.dat");
		if (bankFile.exists()) {
			myBank = load();
		}

		/* allow the user to add or remove money from bank */
		do {
			System.out.println("\n1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit");
			System.out.print("Enter you choice: ");
			choice = input.nextInt();

			if (choice == 1) {
				System.out.println("You have: " + money.format(myBank.giveTotal()) + "\n");
			} else if (choice == 2) {
				myBank.addCoin(PENNY);
			} else if (choice == 3) {
				myBank.addCoin(NICKEL);
			} else if (choice == 4) {
				myBank.addCoin(DIME);
			} else if (choice == 5) {
				myBank.addCoin(QUARTER);
			} else if (choice == 6) {
				System.out.print("How much money do you want to take out? ");
				amount = input.nextDouble();
				myBank.removeCoins(amount);
				System.out.println("You now have: " + money.format(myBank.giveTotal()) + "\n");
			}
		} while (choice != 0);

		/* write bank information to a file */
		store(myBank);
	}
}