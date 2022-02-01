import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.err.print("Digite um número inteiro para saber se é negativo ou não: ");		
		int n = scan.nextInt();
		
		if (n >= 0) {
			System.out.println("O número " + n + " NÃO É NEGATIVO");			
		}
		
		else {
			System.out.println("O número " + n + " É NEGATIVO");
		}
	}

}
