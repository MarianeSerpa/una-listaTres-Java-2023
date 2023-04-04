public class Atividade8 import javax.print.attribute.standard.Media;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner digitador = new Scanner(System.in);

        System.out.println("Digite o total de veículos no estacionamento: ");
        int veiculosEstacio = digitador.nextInt();

        System.out.println("Digite o total de roda no estacionamento: ");
        int roda_no_estacionamento = digitador.nextInt();

        int carros = 0;
        int motos = 0;

        for (int i = 1; i <= veiculosEstacio; i++) {
            System.out.print("Digite a quantidade de rodas do veículo " + i + ": ");
            int qtdRodas = digitador.nextInt();

            if (qtdRodas == 4) {
                carros++;
            } else if (qtdRodas == 2) {
                motos++;
            } else {
                System.out.println("Veículo inválido.");
            }

            System.out.println("O estacionamento tem " + carros + " carros e " + motos + " motos.");
        }
        digitador.close();
    }
}
