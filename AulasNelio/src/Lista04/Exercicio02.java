package Lista04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int valor;
		int in = 0;
		int out = 0;
		
		System.out.print("Digite a quantidade de n?meros que ser? informado: ");
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe um valor: ");
			valor = scan.nextInt();
			if (valor >= 10 && valor <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.print("RESULTADO: ");
		System.out.print("\n" + in + " in");
		System.out.print("\n" + out + " out");
		
	}
}
