package Ejercicios;

import java.util.Scanner;
public class Faltante17835{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int val,inc=0,perdido=0;
		boolean res=true;
		val=S.nextInt();
		int []num=new int[val];
		for(int i=0;i<val & res;i++){
            num[i]=S.nextInt();
            if(i==1){
                inc=num[i]-num[i-1];
            }
            if(i>0){
                  if(num[i]-num[i-1]==inc*2){
                      perdido=num[i-1]+inc;
                      res=false;
                  }else{
                      perdido=-1;
                  }  
           }
		}
		System.out.println(perdido);
	}
}
