package Concursos;
import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int []vec = new int[n];
        for(int i=0;i<n;i++){
            vec[i]=S.nextInt();
        }
        int k=S.nextInt();
        for(int i=0;i<n;i++){
            if(vec[i]%k!=0){
                System.out.print("X ");
            }else{
                System.out.print(vec[i]+" ");
            }
            
        }
    }
    
}
