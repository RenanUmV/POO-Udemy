import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double imposto;
		
		System.out.print("Digite o valor do seu salário: ");
		double salario = scan.nextDouble();
				
		if(salario <= 2000) {
			System.out.println("Isento");
			imposto = 0;
		}
		else if(salario <= 3000) {
			imposto = (salario - 2000)*0.08;
		}
		else if(salario <= 4500) {
			imposto = (salario - 3000)*0.18 + 1000*0.08;
		}
		else {
			imposto = (salario - 4500)*0.28 + 1500*0.18 + 1000*0.08;
		}
		
		if (imposto > 0) {
			System.out.printf("Você pagará R$ %.2f%n", imposto);
		}
	}
}
