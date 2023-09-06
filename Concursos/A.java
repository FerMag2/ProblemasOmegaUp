package Concursos;
import java.util.*;
public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Número de eventos
        Queue<String> alumnos = new LinkedList<>();
        Queue<String> trabajadores = new LinkedList<>();
        List<String> atendidos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String evento = sc.next();
            if (evento.equals("LLEGA ALUMNO")) {
                String nombreAlumno = sc.next();
                alumnos.add(nombreAlumno);
            } else if (evento.equals("LLEGA TRABAJADOR")) {
                String nombreTrabajador = sc.next();
                trabajadores.add(nombreTrabajador);
            } else if (evento.equals("ATIENDE")) {
                // Atender a la siguiente persona
                if (!trabajadores.isEmpty()) {
                    String trabajadorAtendido = trabajadores.poll();
                    atendidos.add(trabajadorAtendido);
                } else if (!alumnos.isEmpty()) {
                    String alumnoAtendido = alumnos.poll();
                    atendidos.add(alumnoAtendido);
                }
            }
        }
        for (String nombre : atendidos) {
            System.out.println(nombre);
        }
        sc.close();
    }
}

