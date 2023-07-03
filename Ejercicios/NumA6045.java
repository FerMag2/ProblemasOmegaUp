package Ejercicios;
import java.util.Scanner;
public class NumA6045{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int contador = 0;
        char caracter;
        do {
            caracter = S.nextLine().charAt(0);
            
            if (caracter == 'A') {
                contador++;
            }
        } while (caracter != '.');
        
        System.out.println(contador);
        S.close();
    }
}
