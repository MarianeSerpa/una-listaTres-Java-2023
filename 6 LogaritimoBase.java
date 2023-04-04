import java.util.Scanner;

public class Atividade6 {
    Scanner a = new Scanner(System.in);

     System.out.println("Digite o primeiro número: ");
    int b = a.nextInt();


    System.out.println("Digite o segundo número: ");
    int c = a.nextInt();

    double resultado = Math.log(b) / Math.log(c);


    System.out.println(resultado);

    input.close();
}
