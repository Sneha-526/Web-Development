package JAVA.pattern;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;

        for (int r = 1; r<=n; r++){
            for (int sp = 1; sp<=nsp; sp++){
                System.out.print("\t");

            }
            for (int st = 1; st<=nst; st++){
                System.out.print("*\t");

            }
            System.out.println();
            if (r<=n/2){
                nst = nst+2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
        }
        scn.close();
    }
}
