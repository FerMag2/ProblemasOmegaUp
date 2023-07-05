package Ejercicios;

import java.util.Scanner;
public class Prom484{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            double numero = S.nextDouble();
            suma += numero;
        }
        double promedio = suma / 5;
        double promedioRedondeado = Math.round(promedio * 10.0) / 10.0;
        System.out.println(promedioRedondeado);
    }
}
