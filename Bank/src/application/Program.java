package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account account = null;
		
		System.out.printf("Enter account number: ");
		int accNumber = scan.nextInt();
		System.out.printf("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.printf("Is there na initial deposit (Y/N)? ");
		char cond = scan.next().charAt(0);
		
		if (cond == 'y' || cond == 'Y') {
			System.out.printf("Enter initial deposit value: ");
			double value = scan.nextDouble();			
			account = new Account(holder, accNumber, value);			
		} 
		else if(cond == 'n' || cond == 'N') {			
			account = new Account(holder, accNumber);			
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = scan.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		scan.close();
	}

}
