package Ejercicios;

import java.util.Scanner;
public class Promedio17063{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long a,b=0;
        long prom;
        a=S.nextLong();
        for(int i=0;i<a;i++){
            b+=S.nextLong();
        }
        prom=b/a;
        System.out.print(prom);
    }
}
