package Lista04;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, n1, n2;
		double resultado;
		
		System.out.print("Digite a quantidade de pares: ");
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o pimeiro n?mero: ");
			n1 = scan.nextInt();
			System.out.printf("Digite o segundo n?mero: ");
			n2 = scan.nextInt();
			
			resultado = (double) n1/n2;
			
			if (n2 == 0) {
				System.out.println("Divis?o imposs?vel!");
			} else {
				System.out.printf("Resultado: %.1f\n", resultado);
				
			}
			
		}
		
		
	}
}
