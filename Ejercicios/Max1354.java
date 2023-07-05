package Ejercicios;
import java.util.Scanner;
public class Max1354{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int A = S.nextInt();
        int B = S.nextInt();
        int C = S.nextInt();
        int maximo = encontrarMaximo(A, B, C);
        System.out.println(maximo);
    }
    public static int encontrarMaximo(int A, int B, int C) {
        int maximo = A;
        if (B > maximo) {
            maximo = B;
        }
        if (C > maximo) {
            maximo = C;
        }
        return maximo;
    }
}
