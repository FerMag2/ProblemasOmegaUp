package Ejercicios;

import java.util.Scanner;
public class Monito17331{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        n=S.nextInt();
        for(int i=n;i>0;i--){
            if(i>1){
                System.out.println(i+" monitos saltaban en la cama, uno se cayo ...");
            }else{
                System.out.println("1 monito saltaba en la cama, uno se cayo ...");
            }
        }
        System.out.println("No hay mas monitos saltando en la cama");
    }
}