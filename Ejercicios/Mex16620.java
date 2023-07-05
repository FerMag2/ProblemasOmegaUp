package Ejercicios;
import java.util.Scanner;
public class Mex16620{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double n,sum=0;
        n=S.nextInt();
        for(int i=0;i<n;i++){
            sum+=S.nextInt();
        }
         System.out.printf("%.0f", sum);
         System.out.print(" ");
         System.out.printf("%.6f", sum/n); 
    }
}
