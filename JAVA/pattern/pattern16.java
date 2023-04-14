package JAVA.pattern;
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 2*n-3;
        int st = 1;
        for(int i=1; i<=n; i++) {
            int x = 1;
            for(int j=1; j<=st; j++){
                System.out.print(x + "\t");
                x++;
            }
            for(int sp=1; sp<=nsp; sp++){
                System.out.print("\t");
            }
            if(i == n){
                st--;
                x--;
            }
            for(int j=1; j<=st; j++){
                x--;
                System.out.print(x + "\t");
            }
            st++;
            nsp-=2;
            System.out.println();
        }
        scn.close();
    }
}