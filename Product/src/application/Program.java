package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducts;
import entities.Product;
import entities.UsedProducts;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: $");
			Double price = scan.nextDouble();
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(scan.next());
				list.add(new UsedProducts(name, price, manufactureDate)); 
			}
			else {
				System.out.print("Customs fee: ");
				Double customsFee = scan.nextDouble();
				list.add(new ImportedProducts(name, price, customsFee));
			}
		}
		
		System.out.println("\nPRICE TAGS: ");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		
		scan.close();
	}
}
