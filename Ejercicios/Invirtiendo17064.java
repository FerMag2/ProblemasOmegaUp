package Ejercicios;
import java.util.Scanner;
public class Invirtiendo17064{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String palabra;
        int numero;
        palabra= S.next(); numero=S.nextInt();
        String nuevaPalabra = cambiarCaracter(palabra, numero-1);
        System.out.println(nuevaPalabra);
        S.close();
    }
    public static String cambiarCaracter(String palabra, int numero) {
        if (numero >= 0 && numero < palabra.length()) {
            char[] caracteres = palabra.toCharArray();
            char caracter = caracteres[numero];
            if (Character.isUpperCase(caracter)) {
                caracteres[numero] = Character.toLowerCase(caracter);
            } else if (Character.isLowerCase(caracter)) {
                caracteres[numero] = Character.toUpperCase(caracter);
            }
            return String.valueOf(caracteres);
        }else {
            return palabra;
        } 
    }
}
