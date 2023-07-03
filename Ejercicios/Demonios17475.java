package Ejercicios;

import java.util.Scanner;
public class Demonios17475{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int sum=0;
        int numero = S.nextInt();
        for(int i=0;i<numero;i++){
            sum+=S.nextInt();
        }
        System.out.println(sum);
        
    }
}