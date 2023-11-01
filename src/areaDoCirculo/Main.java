package areaDoCirculo;

import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        sc.close();
        final double n = 3.14159;

        double area = n * Math.pow(raio, 2);

        area = Math.round(area * 10000.0) / 10000.0;

        String resultado = String.format("%.4f", area);

        System.out.println("A=" + resultado);

    }

}