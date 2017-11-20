package day6;

import java.util.Scanner;

class BankAccount {
	Scanner input = new Scanner(System.in);
	String accountNumber;
	String owner;
	int balance;
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	public void withdraw (int amount) {
		balance -= amount;
	}

	public String toString(int balance) {
		return "\nÀÜ¾× : "+balance; 
	}
	
	public int sendAccouunt(int amount, BankAccount otherAccount) {
		balance += amount;
		otherAccount.balance -= amount;
		return 0;
	}
}
