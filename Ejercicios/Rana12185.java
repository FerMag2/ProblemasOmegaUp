package Ejercicios;
import java.util.Scanner;
public class Rana12185 {
    public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a,b;
		a=S.nextInt();
		b=S.nextInt();
		if(a%2==0){
		    a=a;
		}else{
		    a=a+1;
		}
		for (int i=0;i<b;i++) {
			System.out.print(a+" ");
			a+=2;
		}
	}
}
