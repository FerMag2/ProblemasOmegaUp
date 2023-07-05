package Ejercicios;
import java.util.Scanner;
public class Ascii16612{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter = scanner.nextLine().charAt(0);
        int valorAscii = (int) caracter;
        System.out.println(valorAscii);

        scanner.close();
    }
}
