package Ejercicios;

import java.util.Scanner;
public class Cadena{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String oracion;
        oracion=S.nextLine();
        if (!oracion.isEmpty()) {
            int tamaño = oracion.length();
            System.out.println("El Tamaño De La Oracion Es " + tamaño);
            System.out.print("Las Letras Mayusculas De la Oracion Son: ");
            for (int i = 0; i < tamaño; i++) {
                char letra = oracion.charAt(i);
                if (Character.isUpperCase(letra)) {
                    System.out.print(letra + " ");
                }
            }
            System.out.println();
            
            System.out.print("Las Letras Minusculas De La Oracion Son: ");
            for (int i = 0; i < tamaño; i++) {
                char letra = oracion.charAt(i);
                if (Character.isLowerCase(letra)) {
                    System.out.print(letra + " ");
                }
            }
            System.out.println();
            
            System.out.print("Los Caracteres Especiales Son: ");
            for (int i = 0; i < tamaño; i++) {
                char letra = oracion.charAt(i);
                if (!Character.isLetter(letra) && !Character.isWhitespace(letra)) {
                    System.out.print(letra + " ");
                }
            }
        }
    }
}
