package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n;
		double n1,n2,n3;
		double media;
		int p1 = 2, p2 = 3, p3 = 5; 
		
		System.out.print("Informe quantos casos ser?o passados: ");
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("\nInforme o resultado do primeiro teste: ");
			n1 = scan.nextDouble();
			System.out.print("Informe o resultado do segundo teste: ");
			n2 = scan.nextDouble();
			System.out.print("Informe o resultado do terceiro teste: ");
			n3 = scan.nextDouble();
			
			media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
			
			System.out.printf("M?dia: ");
			System.out.printf("%.1f%n", media);
			
		}
		
	}
}
