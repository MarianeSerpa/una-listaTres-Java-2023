import java.util.Scanner;

public class CalculaSalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double quantHoras, valorPorHora, valorSalFamilia, numFilhos;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite a quantidade de horas trabalhadas no m�s:");
	quantHoras = scanner.nextDouble();
	System.out.println("Digite o valor por hora de trabalho no m�s:");
	valorPorHora = scanner.nextDouble();
	System.out.println("Digite o valor do sal�rio fam�lia:");
	valorSalFamilia = scanner.nextDouble();
	System.out.println("Digite a quantidade de filhos menores de 14 anos de idade:");
	numFilhos = scanner.nextDouble();
	scanner.close();
    System.out.printf("O sal�rio bruto a ser recebido �: %.2f", (quantHoras * valorPorHora) + (valorSalFamilia * numFilhos));
	}
}
