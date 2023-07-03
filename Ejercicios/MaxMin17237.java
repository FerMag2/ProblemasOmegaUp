package Ejercicios;

import java.util.Scanner;
public class MaxMin17237{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long numero = S.nextLong();
        if(numero==0){
            System.out.println(numero);
        }else{
           long resultado = multiplicarDigitos(numero);
        System.out.println(resultado); 
        }
        S.close();
    }
    public static long multiplicarDigitos(long numero) {
        long digitoMaximo = Integer.MIN_VALUE;
        long digitoMinimo = Integer.MAX_VALUE;
        while (numero != 0) {
            long digito = numero % 10;
            digitoMaximo = Math.max(digito, digitoMaximo);
            digitoMinimo = Math.min(digito, digitoMinimo);
            numero /= 10;
        }
        return digitoMaximo * digitoMinimo;
    }
}
