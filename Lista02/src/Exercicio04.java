import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("De que horas o jogo teve inicio? ");
		int inicio = scan.nextInt();
		
		System.out.print("De que horas o jogo encerrou? ");
		int acabou = scan.nextInt();
		
		int total = 0;
		
		if (inicio < acabou) {
			total = acabou - inicio;
		}
		
		else if(inicio == acabou) {
			total = 24;
		}
		else {
			total = (24 - inicio) + acabou;
		}
		
		System.out.println("O jogo teve duração de " + total + " Horas");
	}
}
