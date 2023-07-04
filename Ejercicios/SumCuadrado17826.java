package Ejercicios;

import java.util.Scanner;
public class SumCuadrado17826{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        n=S.nextInt();
        int suma = (n * (n + 1) * (2 * n + 1)) / 6;
        System.out.println(suma);
    }
}
