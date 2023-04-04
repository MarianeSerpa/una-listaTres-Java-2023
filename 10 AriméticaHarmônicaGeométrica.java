public class Atividade10 {


    //abre a classe
    Scanner digitador = new Scanner(System.in);
//primeiro valor
        System.out.print("Primeiro Valor ");
    double a = digitador.nextDouble();

        System.out.print("Segundo varalor");
    double b = digitador.nextDouble();

        System.out.print("Terceiro Valor");

    double c = digitador.nextDouble();

    double MediaGeoo = Math.cbrt(a * b * c);


    double MediaAri = (a + b + c) / 3.0;
    double MediaHar = 3.0 / ((1.0 / a) + (1.0 / b) + (1.0 / c));

    //double media_total = MediaAri;

        System.out.println("Média Aritmética: " + MediaAri);


        System.out.println("Média Harmônica: " + MediaHar);
        System.out.println("Média Geométrica: " + MediaGeoo);

        digitador.close();
}