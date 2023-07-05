package Ejercicios;

import java.util.Scanner;
public class Lapices373{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,k,num,con=0;
        n=S.nextInt(); k=S.nextInt();
        for(int i=0;i<n;i++){
            num=S.nextInt();
            if(num==k){
                con++;
            }
        }
        System.out.println(con);
    }
}