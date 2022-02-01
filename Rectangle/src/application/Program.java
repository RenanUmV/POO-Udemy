package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rect1 = new Rectangle();
		
		System.out.print("Enter rectangle width: ");
		rect1.width = scan.nextDouble();
		System.out.print("Enter rectangle height: ");
		rect1.height = scan.nextDouble();
		
		System.out.printf("AREA: "+ rect1.area());
		System.out.printf("\nPERIMETER: "+ rect1.perimeter());
		System.out.printf("\nDIAGONAL: "+ rect1.diagonal());
		
		scan.close();
		
	}
	
	
}
