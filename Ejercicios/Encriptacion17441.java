package Ejercicios;

import java.util.Scanner;
public class Encriptacion17441{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String palabra1 = S.nextLine();
        String palabra2 = S.nextLine();
        String mensajeEncriptado = encriptarPalabras(palabra1, palabra2);
        System.out.println( mensajeEncriptado);
    }
    public static String encriptarPalabras(String palabra1, String palabra2) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < palabra1.length(); i++) {
            mensaje.append(palabra1.charAt(i));
            mensaje.append(palabra2.charAt(i));
        }
        return mensaje.toString();
    }
}
