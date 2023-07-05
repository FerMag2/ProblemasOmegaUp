package Ejercicios;
import java.util.Scanner;
public class Escalar16030{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long a,b;
        a=S.nextLong();
        long[]vec = new  long[(int)a];
        for(int i=0;i<a;i++){
            vec[i]=S.nextLong();
        }
        b=S.nextLong();
        System.out.print("ARREGLO ORIGINAL: [");
        for(int i=0;i<a;i++){
            System.out.print(vec[i]);
            if(i<a-1){
                System.out.print(" ");
            }
        }
        System.out.print("]");
        System.out.println("");
        
        System.out.print("MULTIPLICADO POR EL ESCALAR: [");
        for(int i=0;i<a;i++){
            System.out.print(vec[i]*b);
            if(i<a-1){
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
}

