package Concursos;

import java.util.Scanner;

public class I{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inicioX = sc.nextInt();
        int inicioY = sc.nextInt();
        int metaX = sc.nextInt();
        int metaY = sc.nextInt();
        
        int numTiros = sc.nextInt();
        int[] distancias = new int[numTiros];
        
        for (int i = 0; i < numTiros; i++) {
            distancias[i] = sc.nextInt();
        }
        
        int[][] dp = new int[101][101]; // Usamos un tamaño máximo para el campo de golf
        
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                dp[i][j] = -1; // Inicializamos con -1 (representando que no se puede llegar)
            }
        }
        
        dp[inicioX][inicioY] = 0; // La posición inicial es alcanzable con 0 tiros
        
        for (int tiro = 0; tiro < numTiros; tiro++) {
            for (int x = 0; x <= 100; x++) {
                for (int y = 0; y <= 100; y++) {
                    if (dp[x][y] >= 0) {
                        int nuevoX = x + distancias[tiro];
                        int nuevoY = y + distancias[tiro];
                        
                        if (nuevoX <= 100 && nuevoY <= 100) {
                            dp[nuevoX][nuevoY] = (dp[nuevoX][nuevoY] == -1) ? dp[x][y] + 1 : Math.min(dp[nuevoX][nuevoY], dp[x][y] + 1);
                        }
                    }
                }
            }
        }
        
        int resultado = dp[metaX][metaY];
        System.out.println(resultado);
        
        sc.close();
    }
}
