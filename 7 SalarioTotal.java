import java.util.Scanner;
public class Atividade7 {
        public static void main(String[] args) {
                Scanner digitador = new Scanner(System.in);

                System.out.println("Digite o salário: ");
                double salario = digitador.nextDouble();

                System.out.println("Digite o valor da venda: ");
                double venda = digitador.nextDouble();

                System.out.println("Digite o valor da comissão: ");
                double comissao = digitador.nextDouble();

                double total = salario + (venda * (comissao / 100));

                System.out.println("Total do salario no final será: R$" + total);

                digitador.close();

        }
}
