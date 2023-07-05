package Ejercicios;

import java.util.Scanner;
public class ParImpar483{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        n=S.nextInt();
        if(n%2==0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
