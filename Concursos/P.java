package Concursos;

import java.util.Scanner;

public class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer las dimensiones del laberinto
        int F = sc.nextInt(); // Número de filas
        int C = sc.nextInt(); // Número de columnas

        // Leer el laberinto
        char[][] laberinto = new char[F][C];
        int entradaX = -1, entradaY = -1; // Coordenadas de la entrada
        int salidaX = -1, salidaY = -1; // Coordenadas de la salida

        for (int i = 0; i < F; i++) {
            String fila = sc.next();
            for (int j = 0; j < C; j++) {
                char c = fila.charAt(j);
                laberinto[i][j] = c;
                if (c == 'E') {
                    entradaX = i;
                    entradaY = j;
                } else if (c == 'S') {
                    salidaX = i;
                    salidaY = j;
                }
            }
        }

        // Llamar a la función de búsqueda
        if (buscarSalida(laberinto, entradaX, entradaY, salidaX, salidaY)) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

    // Función de búsqueda en profundidad (DFS)
    public static boolean buscarSalida(char[][] laberinto, int x, int y, int salidaX, int salidaY) {
        // Verificar si estamos fuera de los límites del laberinto o si estamos en una pared
        if (x < 0 || x >= laberinto.length || y < 0 || y >= laberinto[0].length || laberinto[x][y] == '#') {
            return false;
        }

        // Verificar si hemos llegado a la salida
        if (x == salidaX && y == salidaY) {
            return true;
        }

        // Marcamos la casilla actual como visitada
        laberinto[x][y] = '#';

        // Intentar moverse en las cuatro direcciones posibles
        boolean arriba = buscarSalida(laberinto, x - 1, y, salidaX, salidaY);
        boolean abajo = buscarSalida(laberinto, x + 1, y, salidaX, salidaY);
        boolean izquierda = buscarSalida(laberinto, x, y - 1, salidaX, salidaY);
        boolean derecha = buscarSalida(laberinto, x, y + 1, salidaX, salidaY);

        // Si alguna de las direcciones lleva a la salida, retornar true
        return arriba || abajo || izquierda || derecha;
    }
}

