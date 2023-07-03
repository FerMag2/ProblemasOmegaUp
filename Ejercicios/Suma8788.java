package Ejercicios;
import java.util.Scanner;
public class Suma8788{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long n,res=0;
        n=S.nextLong();
        res=(n*(n+1))/2;
        System.out.println(res);
    }
}
