package Ejercicios;
import java.util.Scanner;
public class Promedio8783{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double sum=0,prom=0;
        for(int i=0;i<7;i++){
            sum+=S.nextDouble();
        }
        prom=sum/7;
        System.out.printf("%.1f%n", prom);
    }
}
