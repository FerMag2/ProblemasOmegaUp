package Ejercicios;

import java.util.Scanner;
public class Factorial8586{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,fac=1;
        n=S.nextInt();
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
