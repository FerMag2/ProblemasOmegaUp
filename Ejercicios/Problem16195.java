package Ejercicios;

import java.util.Scanner;
public class Problem16195{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
         int a,b;
         a=S.nextInt(); b=S.nextInt();
         if(a<b){
             System.out.println("Izquierda");
         }else if(a>b){
             System.out.println("Derecha");
         }else{
             System.out.println("Centro");
         }
    }
}
