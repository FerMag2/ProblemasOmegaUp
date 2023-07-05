package Ejercicios;

import java.util.Scanner;
public class Mayor865{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a;
        a=S.nextInt();
        if(a>=18){
            System.out.println("Es Mayor");
        }else{
            System.out.println("Es Menor");
        }
    }
}