package Concursos;
import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a,b,c,d,e,f;
        a=S.nextInt();
        b=S.nextInt();
        c=S.nextInt();
        d=S.nextInt();
        e=S.nextInt();
        f=S.nextInt();
        int reb=a*8;
        int sum=b+c+d+e+f;
        if(reb-sum>=1){
            System.out.println("FF");
        }else{
            System.out.println("FH");
        }
    }
    
}
