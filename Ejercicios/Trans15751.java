package Ejercicios;
import java.util.Scanner;
public class Trans15751{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        String cadenaModificada = modificarCadena(cadena);
        System.out.println(cadenaModificada);
    }
    public static String modificarCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();
        boolean siguienteMayuscula = true;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isLetter(caracter)) {
                if (siguienteMayuscula) {
                    caracter = Character.toUpperCase(caracter);
                } else {
                    caracter = Character.toLowerCase(caracter);
                }
                siguienteMayuscula = !siguienteMayuscula;
            }
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
