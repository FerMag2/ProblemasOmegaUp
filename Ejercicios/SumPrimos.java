package Ejercicios;
import java.util.Scanner;
public class SumPrimos{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        long suma = 0;
        int count = 0; 
        int num = 2; 
        while (count < N) {
            if (esPrimo(num)) {
                suma += num;
                count++;
            }
            num++;
        }
        System.out.println(suma);
    }
    public static boolean esPrimo(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
