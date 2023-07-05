package Ejercicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Pal16629{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        scanner.nextLine(); 
        String cadena = scanner.nextLine();
        if (esPalindromoPosible(cadena)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean esPalindromoPosible(String cadena) {
        Map<Character, Integer> frecuencias = new HashMap<>();
        for (char c : cadena.toCharArray()) {
            frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
        }
        int caracteresImpares = 0;
        for (int frecuencia : frecuencias.values()) {
            if (frecuencia % 2 != 0) {
                caracteresImpares++;
            }
        }
        return caracteresImpares <= 1;
    }
}
