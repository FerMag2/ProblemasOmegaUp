package Ejercicios;

import java.util.Scanner;
public class SumCar5161{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPalabras = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numPalabras; i++) {
            String palabra = scanner.nextLine();
            int suma = calcularSumaLetras(palabra);
            System.out.println(suma);
        }
    }
    public static int calcularSumaLetras(String palabra) {
        int suma = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int valor = letra - 'A' + 1; 
            suma += valor;
        }
        return suma;
    }
}