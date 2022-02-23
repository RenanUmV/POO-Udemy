package Lista04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um valor inteiro para X entre 1 e 1000: ");
		x = scan.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
