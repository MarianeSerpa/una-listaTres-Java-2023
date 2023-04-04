import java.util.Scanner;

public class ValorProduto {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		double valorProduto;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do produto:");
		valorProduto = scanner.nextDouble();
		scanner.close();
	    System.out.printf("O valor do produto acrescido de 10 por cento é: %.2f", (valorProduto * 0.1) + valorProduto);
		}
	}