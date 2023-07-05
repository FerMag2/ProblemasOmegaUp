package Ejercicios;

import java.util.Scanner;
public class Rep1274{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] datos = new int[n];
        for (int i = 0; i < n; i++) {
            datos[i] = S.nextInt();
        }
        int primerDato = datos[0];
        int repeticiones = contarRepeticiones(datos, primerDato);
        System.out.println(repeticiones);
    }
    public static int contarRepeticiones(int[] datos, int dato) {
        int repeticiones = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == dato) {
                repeticiones++;
            }
        }
        return repeticiones;
    }
}
