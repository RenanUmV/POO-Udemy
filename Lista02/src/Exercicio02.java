import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um númeiro inteiro para ser se é PAR ou ÍMPAR: ");
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O número informado é PAR!");
		}
		
		else {
			System.out.println("O número digitado é ÍMPAR!");
		}
	}
}
