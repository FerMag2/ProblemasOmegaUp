package Ejercicios;
import java.util.Scanner;
public class Condicion15854{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        n=S.nextInt();
        if(n>100){
            System.out.println(n+300);
        }else{
            System.out.print(n);
        }
        }
}