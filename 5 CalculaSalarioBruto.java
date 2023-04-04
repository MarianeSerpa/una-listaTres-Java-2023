import java.util.Scanner;

public class CalculaSalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double quantHoras, valorPorHora, valorSalFamilia, numFilhos;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite a quantidade de horas trabalhadas no mês:");
	quantHoras = scanner.nextDouble();
	System.out.println("Digite o valor por hora de trabalho no mês:");
	valorPorHora = scanner.nextDouble();
	System.out.println("Digite o valor do salário família:");
	valorSalFamilia = scanner.nextDouble();
	System.out.println("Digite a quantidade de filhos menores de 14 anos de idade:");
	numFilhos = scanner.nextDouble();
	scanner.close();
    System.out.printf("O salário bruto a ser recebido é: %.2f", (quantHoras * valorPorHora) + (valorSalFamilia * numFilhos));
	}
}
