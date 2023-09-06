package Concursos;
import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a,b,c;
        int sum=0,res=0;
        a=S.nextInt(); b=S.nextInt(); c=S.nextInt();
        sum=a+b+c;
        res=45%sum;
        if(45%sum==0){
            System.out.println("Ramona");
        }else if(res-a<=0){
            System.out.println("Maeva");
        }else{
            System.out.println("Lorena");
        }
    }
    
}
