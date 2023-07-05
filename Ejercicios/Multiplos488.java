package Ejercicios;

import java.util.Scanner;
public class Multiplos488{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (sonMultiplos(num1, num2)) {
            System.out.println("multiplos");
        } else {
            System.out.println("no multiplos");
        }
    }
    public static boolean sonMultiplos(int num1, int num2) {
        if (num2 == 0) {
            return false;
        }
        return num1 % num2 == 0 || num2 % num1 == 0;
    }
}
