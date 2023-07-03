package Ejercicios;

import java.util.Scanner;
public class Gauss16707{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,res=0;
        n=S.nextInt();
        res=(n*(n+1))/2;
        System.out.println(res);
    }
}
