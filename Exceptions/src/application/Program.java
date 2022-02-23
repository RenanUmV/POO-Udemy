package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Enter account data");
		System.out.print("Account Number: ");
		int number = scan.nextInt();
		System.out.print("Holder name: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("Initial Balance: ");
		double initialBalance = scan.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = scan.nextDouble();
		
		Account acc = new Account(number, name, initialBalance, withdrawLimit);		
		
		System.out.print("Enter amount for withdraw: ");
		double amount = scan.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.print("New balance: $"+ acc.getBalance());
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}
}
