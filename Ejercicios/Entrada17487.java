package Ejercicios;
import java.util.Scanner;
public class Entrada17487
{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String pal,nuevo="";
		int ini;
		pal=S.nextLine();
		for(int i=0;i<pal.length();i++){
		    ini=S.nextInt();
		    nuevo+=pal.charAt(ini-1);
		}
		System.out.println(nuevo);
	}
}
