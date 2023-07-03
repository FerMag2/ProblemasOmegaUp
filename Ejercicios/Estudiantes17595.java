package Ejercicios;

import java.util.Scanner;
public class Estudiantes17595{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int entrada=5,cont=0,cont2=0;
		while(entrada!=-1){
		    if(entrada==1){
                cont++;		        
		    }else if(entrada==0){
		        cont2++;
		    }
		    entrada=S.nextInt();
		}
		if(cont2>=cont){
            System.out.println("JORNADA RECHAZADA");		    
		}else{
		     System.out.println("JORNADA APROBADA");
		}
	}
}
