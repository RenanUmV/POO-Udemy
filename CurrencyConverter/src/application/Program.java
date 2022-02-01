package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dollarPrice = scan.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double amount = scan.nextDouble();
		
		double value = CurrencyConverter.convDollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", value);
		
		scan.close();
	}
}
