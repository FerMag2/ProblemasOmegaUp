package Ejercicios;
import java.util.Scanner;
public class Teclado17250{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String cadena = S.nextLine();
        String cadenaModificada = reemplazarCaracteres(cadena);
        System.out.println(cadenaModificada);
        S.close();
    }
    public static String reemplazarCaracteres(String cadena) {
        StringBuilder cadenaModificada = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '0') {
                cadenaModificada.append(" ");
            } else if (caracter == '1') {
                cadenaModificada.append("\n");
            } else if (caracter == '2') {
                cadenaModificada.append("\\");
            } else {
                cadenaModificada.append(caracter);
            }
        }
        return cadenaModificada.toString();
    }
}
