import java.util.Scanner;
public class CalculaJuros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double capital, juros, meses;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor do capital :");
	capital = scanner.nextDouble();
	System.out.println("Digite o prazo de aplicação em quantidade de meses:");
	meses = scanner.nextInt();
	System.out.println("Digite a taxa de juros mensal:");
	juros = scanner.nextDouble();
	scanner.close();
    
    System.out.printf("O montante a ser recebido é: %.2f reais", (capital * (Math.pow((1 + juros), meses))));
	}

}

