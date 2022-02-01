import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = scan.nextInt();
		
		System.out.print("Digite um valor para B: ");
		int b = scan.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos!");
		}
		else {
			System.out.println("Não são Multiplos");
		}
	}
}
