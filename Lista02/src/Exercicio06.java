import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valo entre 0 e 100: ");
		double n = scan.nextDouble();
		
		if(n >= 0 && n <= 25) {
			System.out.println("Pertence ao intervalor [0, 25]");
		}
		else if(n > 25 && n <= 50) {
			System.out.println("Pertence ao intervalor [25, 50]");
		}
		else if(n > 50 && n <= 75) {
			System.out.println("Pertence ao intervalor [50, 75]");
		}
		else if(n > 75 && n <= 100) {
			System.out.println("Pertence ao intervalor [75, 100]");
		}
		else {
			System.out.println("Fora do intervalor!");
		}
		
		
	}
}
