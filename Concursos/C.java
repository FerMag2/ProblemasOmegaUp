package Concursos;
import java.util.Scanner;
import java.util.Arrays;
public class C {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] vec = new int[5];
        vec[0]=S.nextInt();
        vec[1]=S.nextInt();
        vec[2]=S.nextInt();
        vec[3]=S.nextInt();
        vec[4]=S.nextInt();
        Arrays.sort(vec);
        System.out.println(vec[4]+" "+vec[3]+" "+vec[2] +" "+vec[1]+" "+vec[0]);
    }  
}
