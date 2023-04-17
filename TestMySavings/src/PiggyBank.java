

import java.io.*;

public class PiggyBank implements Serializable {
	private double moneyInBank;
	

	public PiggyBank() {
		moneyInBank = 0;
	}
	

	/** 
	 * Money has been added to the bank.
	 * pre: none
	 * post: The moeny in the bank has increased.
	 */
	public void addCoin(double cents) {
		moneyInBank += cents;
	}


	/** 
	 * Returns the amount of money in the bank.
	 * pre: none
	 * post: The total of the coins in the bank is returned.
	 */
	public double giveTotal() {
	 	return(moneyInBank);
	}


	/** 
	 * Removes money from the bank.
	 * pre: none
	 * post: The bank has less money in it.
	 */
	public void removeCoins(double amount) {
		if (moneyInBank >= amount) {
			moneyInBank -= amount;
		} else {
			System.out.println("There isn't this much money in the bank.");
		}
	}
}
