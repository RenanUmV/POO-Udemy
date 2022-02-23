package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
				
		System.out.println("How many employees will be registered? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1));
			
			System.out.print("Id: ");
			int id = scan.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Salary: $");
			double salary = scan.nextDouble();
			
			list.add(new Employee(id, name, salary));			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = scan.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			emp.increaseSalary(percent);
		}
			
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		
		scan.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
