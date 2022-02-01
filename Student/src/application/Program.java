package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student st1 = new Student();
		
		System.out.printf("Student name: ");
		st1.name = scan.nextLine();
		
		System.out.printf("Grade 1: ");
		st1.n1 = scan.nextDouble();
		
		System.out.printf("Grade 2: ");
		st1.n2 = scan.nextDouble();
		
		System.out.printf("Grade 3: ");
		st1.n3 = scan.nextDouble();
		
		st1.average();
		
		scan.close();
	}

}
