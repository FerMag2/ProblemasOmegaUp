package Concursos;
import java.util.Scanner;
public class R2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicionBolita = sc.nextInt();
        int numMovimientos = sc.nextInt();
        for (int i = 0; i < numMovimientos; i++) {
            int movimiento = sc.nextInt();
            posicionBolita = realizarMovimiento(posicionBolita, movimiento);
        }
        System.out.println(posicionBolita);
        sc.close();
    }
    public static int realizarMovimiento(int posicionActual, int movimiento) {
        switch (movimiento) {
            case 1:
                return (posicionActual == 1) ? 2 : (posicionActual == 2) ? 1 : posicionActual;
            case 2:
                return (posicionActual == 1) ? 3 : (posicionActual == 3) ? 1 : posicionActual;
            case 3:
                return (posicionActual == 1) ? 4 : (posicionActual == 4) ? 1 : posicionActual;
            case 4:
                return (posicionActual == 2) ? 3 : (posicionActual == 3) ? 2 : posicionActual;
            case 5:
                return (posicionActual == 2) ? 4 : (posicionActual == 4) ? 2 : posicionActual;
            case 6:
                return (posicionActual == 3) ? 4 : (posicionActual == 4) ? 3 : posicionActual;
            default:
                return posicionActual;
        }
    }
}