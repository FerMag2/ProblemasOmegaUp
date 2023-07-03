package Ejercicios;

import java.util.Scanner;
public class Ocho17596{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
       int n=0,cont=0,cont2=0;
       while(n!=8){
           cont++;
           if(n%2==0){
              cont2++;
          }
          n=S.nextInt();
       }
       System.out.println(cont+" "+cont2);
    }
}
