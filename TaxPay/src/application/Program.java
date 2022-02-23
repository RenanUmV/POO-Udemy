package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicPerson;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = scan.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = scan.nextDouble();
				list.add(new PhysicPerson(name, annualIncome, healthExpenses));
			}
			else {
				System.out.print("Number of employees: ");
				Integer nFunc = scan.nextInt();
				list.add(new LegalPerson(name, annualIncome, nFunc));
			}
		}
		
		double sum = 0;
		System.out.println("\nTAXES PAID:");
		for(TaxPayer tp : list) {
			double tax = tp.payment();
			System.out.println(tp.getName() + " : $" + String.format("%.2f", tax));
			sum += tp.payment();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + sum);
	scan.close();	
	}
}
