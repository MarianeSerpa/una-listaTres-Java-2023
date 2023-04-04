import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int segundos = numero.nextInt();

        int hora = segundos / 3600;

        int minuto = segundos / 60;

        System.out.printf("%02d:%02d:%02d", hora, minuto, segundos);

        numero.close();

    }


}