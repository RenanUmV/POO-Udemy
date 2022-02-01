import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] produtos = {"Cachorro Quente", "X-Salada", "X-Bacon  ", "Torrada Simples", "Refrigerante"};
		double[] precos = {4, 4.5, 5, 2, 1.5};
		int qnt;
		int codigo;
		double total = 0;
		
		System.out.println("====================================================");
		System.out.println(" CODIGO             ESPECIFICAÇÃO             PREÇO ");
		System.out.println("====================================================");
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("  " + (i+1) + "\t\t" + produtos[i] + "\t\t\t" + precos[i] + "\n");
		}
		
		System.out.println("====================================================");
		
		System.out.print("Digite o código do produto: ");
		codigo = scan.nextInt();
		System.out.print("Digite a quantidade: ");
		qnt = scan.nextInt();
		
		if (codigo == 1) {
			total = precos[(codigo-1)]*qnt;
		}
		
		else if(codigo == 2) {
			total = precos[(codigo-1)]*qnt;
		}
		
		else if(codigo == 3) {
			total = precos[(codigo-1)]*qnt;
		}
		
		else if(codigo == 4) {
			total = precos[(codigo-1)]*qnt;
		}
		
		System.out.printf("Você escolheu " + qnt + "x " + produtos[(codigo-1)]);
		System.out.printf("\nTotal da compra: R$ " + total);
		
	}
}
