package Ejercicios;

import java.util.Scanner;
public class Perfecto17449{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int numero = S.nextInt();
        if(numero<=0){
            System.out.println("El número debe ser positivo");
        }else{
            if (esNumeroPerfecto(numero)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        }
    }
    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false; 
        }
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero) {
            return true;
        } else {
            return false;
        }
    }
}
