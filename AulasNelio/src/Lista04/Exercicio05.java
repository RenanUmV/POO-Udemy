package Lista04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, total=1;
		
		System.out.printf("Digite qual número deseja calcular o fatorial: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			total *= i;
		}
		if (n == 0) {
			total = 1;
			System.out.printf("Fatorial de "+ n+ "é: "+ total);
		}
		System.out.printf("Fatorial de "+ n+ " é: "+ total);		
	}
}
