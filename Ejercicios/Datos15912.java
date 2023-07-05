package Ejercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Datos15912{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        List<String> datos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String dato = scanner.nextLine();
            datos.add(dato);
        }
        for (int i = 0; i < datos.size(); i++) {
            System.out.print(datos.get(i));
            if (i < datos.size() - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
