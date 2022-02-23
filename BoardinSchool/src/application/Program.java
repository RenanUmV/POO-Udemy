package application;

import java.text.ParseException;
import java.util.Scanner;



import entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException{
		Scanner scan = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		
		for (int i = 1; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		scan.close();
	}

}
