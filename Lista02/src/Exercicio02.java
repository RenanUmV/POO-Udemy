import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�meiro inteiro para ser se � PAR ou �MPAR: ");
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O n�mero informado � PAR!");
		}
		
		else {
			System.out.println("O n�mero digitado � �MPAR!");
		}
	}
}
