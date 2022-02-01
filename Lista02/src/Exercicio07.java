import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira coordenada do ponto: ");
		double x = scan.nextDouble();
		
		System.out.print("Digite a segunda coordenada do ponto: ");
		double y = scan.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		else if(x == 0) {
			System.out.println("Eixo X");
		}
		
		else if(y == 0) {
			System.out.println("Eixo Y");
		}
		
		else if(x > 0 && y > 0) {
			System.out.println("Pertence ao primeiro Quadrante (Q1)");
		}
		
		else if(x < 0 && y > 0) {
			System.out.println("Pertence ao segundo Quadrante (Q2)");
		}
		
		else if(x < 0 && y < 0) {
			System.out.println("Pertence ao terceiro Quadrante (Q3)");
		}
		
		else if(x > 0 && y < 0) {
			System.out.println("Pertence ao quarto Quadrante (Q4)");
		}
	}
}
