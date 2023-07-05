package Ejercicios;

import java.util.Scanner;
public class Let16610{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char r = scanner.next().charAt(0);
        int contador = contarCaracter(s, r);
        System.out.println(contador);
        scanner.close();
    }
    public static int contarCaracter(String s, char r) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == r) {
                contador++;
            }
        }
        return contador;
    }
}
