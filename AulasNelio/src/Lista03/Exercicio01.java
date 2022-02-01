package Lista03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int senha = 2002;		
		
		System.out.print("Digite a senha para ter acesso: ");
		int senhaDigitada = scan.nextInt();
		
		
		while(senhaDigitada != senha) {
			System.out.print("Senha Invalida!");
			System.out.print("\nDigite a senha para ter acesso: ");
			senhaDigitada = scan.nextInt();
		}
		
		System.out.println("Acesso Permitido");
	}
}
