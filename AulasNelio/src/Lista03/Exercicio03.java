package Lista03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int resp = 0;
		
		while (true) {
			System.out.println("Digite o tipo de combust?vel abastecido: (1)Alcool (2)Gasolina (3)Diesel (4)SAIR");
			resp = scan.nextInt();
			
			if (resp == 1) {
				alcool += 1;
			} else if(resp == 2) {
				gasolina += 1;
			} else if(resp == 3) {
				diesel += 1;
			} else if (resp == 4) {
				break;
			} else {
				System.out.println("C?digo Inv?lido");
			}
		}
		
		System.out.println("Muito Obrigado!");
		System.out.printf("Alcool: " + alcool);
		System.out.printf("\nGasolina: " + gasolina);
		System.out.printf("\nDiesel: " + diesel);
	}
}
