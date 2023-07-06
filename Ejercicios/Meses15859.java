package Ejercicios;

import java.util.Scanner;
public class Meses15859{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
         String []vec = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int n;
        n=S.nextInt();
        System.out.println(vec[n-1]);
    }
}
