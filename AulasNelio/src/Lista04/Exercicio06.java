package Lista04;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.printf("Digite o numero que deseja saber seus divisores: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				System.out.println(i);
			}
			
		}
	}
}
