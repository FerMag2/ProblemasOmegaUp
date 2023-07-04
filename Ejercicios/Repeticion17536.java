package Ejercicios;

import java.util.Scanner;
public class Repeticion17536{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String secuenciaADN;
        secuenciaADN=S.nextLine();
        int repeticionMaxima = encontrarRepeticionMaxima(secuenciaADN);
        System.out.println(repeticionMaxima);
    }
    public static int encontrarRepeticionMaxima(String secuenciaADN) {
        int maxRepeticion = 0;
        int repeticionActual = 1;
        for (int i = 1; i < secuenciaADN.length(); i++) {
            if (secuenciaADN.charAt(i) == secuenciaADN.charAt(i - 1)) {
                repeticionActual++;
            } else {
                if (repeticionActual > maxRepeticion) {
                    maxRepeticion = repeticionActual;
                }
                repeticionActual = 1;
            }
        }
        if (repeticionActual > maxRepeticion) {
            maxRepeticion = repeticionActual;
        }
        return maxRepeticion;
    }
}