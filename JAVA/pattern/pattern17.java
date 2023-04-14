package JAVA.pattern;
import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        for(int i=1; i<=n; i++) {
            for(int nsp=1; nsp<=sp; nsp++) {
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            if(i<=n/2+1){
                for(int j=1; j<=i; j++) {
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=i; j<=n; j++) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
