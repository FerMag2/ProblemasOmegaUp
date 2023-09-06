package Concursos;
import java.util.*;
public class D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos = sc.nextInt();
        Map<Integer, Integer> contadorEdades = new TreeMap<>();
        for (int i = 0; i < numAlumnos; i++) {
            int edad = sc.nextInt();
            contadorEdades.put(edad, contadorEdades.getOrDefault(edad, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : contadorEdades.entrySet()) {
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
        sc.close();
    }
}