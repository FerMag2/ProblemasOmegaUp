package Ejercicios;
import java.util.Scanner;
public class AreaCir10629{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double radio = S.nextDouble();
        double area = calcularAreaCirculo(radio);
        System.out.printf("%.2f%n", area);
        S.close();
    }
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
