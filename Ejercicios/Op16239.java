package Ejercicios;
import java.util.Scanner;
public class Op16239{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double suma = A + B;
        double resta = A - B;
        double multiplicacion = A * B;
        double potencia = Math.pow(A, B);
        double division = A / B;
        double divisionEntera = (int) (A / B);
        double modulo = A % B;
        System.out.printf("%.0f%n", suma);
       System.out.printf("%.0f%n", resta);
        System.out.printf("%.0f%n", multiplicacion);
        System.out.printf("%.0f%n", potencia);
        System.out.println(division);
        System.out.printf("%.0f%n", divisionEntera);
        System.out.printf("%.0f%n", modulo);

        scanner.close();
    }
}
