package Lista04;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.printf("Digite a quantidade de linhas que deseja ver: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("\n" + i + " " + i*i +" " + i*i*i);
		}
	}
}
