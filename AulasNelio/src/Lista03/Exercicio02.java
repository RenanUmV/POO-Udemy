package Lista03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Digite o valor da coordenada X: ");
			int x = scan.nextInt();
			System.out.print("Digite o valor da coordenada Y: ");
			int y = scan.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if(x == 0 || y == 0) {
				break;
			}
		}
	}
}
