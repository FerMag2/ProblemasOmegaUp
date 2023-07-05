package Ejercicios;

import java.util.Scanner;
public class Ciclo482{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n=1,sum=0;
        while(n!=0){
            n=S.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
