import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.err.print("Digite um n�mero inteiro para saber se � negativo ou n�o: ");		
		int n = scan.nextInt();
		
		if (n >= 0) {
			System.out.println("O n�mero " + n + " N�O � NEGATIVO");			
		}
		
		else {
			System.out.println("O n�mero " + n + " � NEGATIVO");
		}
	}

}
