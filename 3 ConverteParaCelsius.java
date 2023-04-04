import java.util.Scanner;

public class ConverteParaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double tempFahrenheit;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor da temperatura em Fahrenheit:");
	tempFahrenheit = scanner.nextDouble();
	scanner.close();
    
    System.out.printf("A temperatura em graus Celsius é: %f", (tempFahrenheit - 32) / 1,8);
	}

}
