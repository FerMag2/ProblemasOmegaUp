package Ejercicios;

import java.util.Scanner;
public class Arreglos17260{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,num;
        n=S.nextInt();
        int []vec = new int[n];
        for(int i=0;i<n;i++){
            num=S.nextInt();
            vec[i]= ((((((((((num+12)*3)+125)%77)*12)+99)*4)%123)*7)%88);
        }
        for(int i=0;i<n;i++){
            if(i==n-1){
               System.out.print(vec[i]); 
            }else{
                System.out.print(vec[i]+" ");
            }
        }
    }
}
