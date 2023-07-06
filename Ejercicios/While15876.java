package Ejercicios;

import java.util.Scanner;
public class While15876{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n=0,sum=0,con=0;
        while(n>=0){
            sum+=n;
            con++;
            n=S.nextInt();
        }
        System.out.println(sum);
        System.out.println(con);
    }
}
