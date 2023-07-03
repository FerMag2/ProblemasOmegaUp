package Ejercicios;

import java.util.Scanner;
public class ModSum17274{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,k,sum=0,res=0;
        n=S.nextInt(); k=S.nextInt();
        for(int i=0;i<n;i++){
            sum+=S.nextInt();
        }
        res=sum%k;
        System.out.println(res);
    }
}