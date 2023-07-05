package Ejercicios;
import java.util.Scanner;
public class Creciente1261{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        if (esOrdenCreciente(numeros)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean esOrdenCreciente(int[] numeros) {
        int n = numeros.length;
        for (int i = 1; i < n; i++) {
            if (numeros[i] < numeros[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
