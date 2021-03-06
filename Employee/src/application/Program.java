package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.printf("Name: ");
		emp.name = scan.nextLine();
		System.out.printf("Gross Salary: ");
		emp.grossSalary = scan.nextDouble();
		System.out.printf("Tax: ");
		emp.tax = scan.nextDouble();
		
		System.out.println("Employee: "+emp);
		
		System.out.printf("\nWhich percentage to increase salary? ");
		double percentage = scan.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.printf("\nUpdated data: " + emp);
		
		
		
		scan.close();
	}

}
