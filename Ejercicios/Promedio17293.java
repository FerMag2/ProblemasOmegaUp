package Ejercicios;

import java.util.Scanner;
public class Promedio17293{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long a,b=0;
        double prom;
        a=S.nextLong();
        for(int i=0;i<a;i++){
            b+=S.nextLong();
        }
        prom=b*1.0/a*1.0;
        System.out.printf("%.2f", prom);
    }
}
