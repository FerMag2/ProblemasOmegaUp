package Concursos;
import java.util.Scanner;
public class R{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int []vec = new int[4];
        int aux=0;
        int val=0;
        vec[0]=1;
        vec[1]=2;
        vec[2]=3;
        vec[3]=4;
        int t=S.nextInt();
        int m=S.nextInt();
        val=vec[t-1];
        for(int i=0;i<m;i++){
            int n=S.nextInt();
            aux=0;
            if(n==1){
                aux=vec[0];
                vec[0]=vec[1];
                vec[1]=aux;
            }else if(n==2){
                aux=vec[0];
                vec[0]=vec[2];
                vec[2]=aux;
            }else if(n==3){
                aux=vec[0];
                vec[0]=vec[3];
                vec[3]=aux;
            }else if(n==4){
                aux=vec[1];
                vec[1]=vec[2];
                vec[2]=aux;
            }else if(n==5){
                 aux=vec[1];
                vec[1]=vec[3];
                vec[3]=aux;
            }else if(n==6){
                aux=vec[2];
                vec[2]=vec[3];
                vec[3]=aux;
            }
        }
        for(int i=0;i<4;i++){
            if(val==vec[i]){
                System.out.println((i+1));
            }
        }
    }
}
