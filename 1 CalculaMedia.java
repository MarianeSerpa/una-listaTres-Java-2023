import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double num1, num2;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o primeiro n�mero:");
	num1 = scanner.nextDouble();
	System.out.println("Digite o segundo n�mero:");
	num2 = scanner.nextDouble();
	scanner.close();
    System.out.printf("A m�dia dos dois n�meros �: %.2f", (num1 + num2) / 2 );
	}
}

