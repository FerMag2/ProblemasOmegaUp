package Ejercicios;
import java.util.Scanner;
public class Rev932{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linea = scanner.nextLine();
        String resultado = invertirBits(linea);
        System.out.println(resultado);
    }
    public static String invertirBits(String linea) {
        String[] bits = linea.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String bit : bits) {
            if (bit.equals("0")) {
                resultado.append("1 ");
            } else if (bit.equals("1")) {
                resultado.append("0 ");
            }
        }
        return resultado.toString().trim();
    }
}
