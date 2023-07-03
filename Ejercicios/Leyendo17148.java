package Ejercicios;

import java.util.Scanner;
public class Leyendo17148{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String cadena = S.nextLine();
        char[] arregloCaracteres = cadena.toCharArray();
        for (int i = arregloCaracteres.length - 1; i >= 0; i--) {
            System.out.print(arregloCaracteres[i]);
        }
        System.out.println();
    }
}