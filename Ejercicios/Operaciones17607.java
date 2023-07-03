package Ejercicios;

import java.util.Scanner;
public class Operaciones17607{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long a,b,sum,res,mul,mod;
        double div;
        a=S.nextLong(); b=S.nextLong();
        sum=a+b;
        res=a-b;
        mul=a*b;
        div=a*1.0/b*1.0;
        mod=a%b;
        System.out.println(sum);
        System.out.println(res);
        System.out.println(mul);
        System.out.printf("%.2f", div);
        System.out.println("");
        System.out.println(mod);
    }
}
