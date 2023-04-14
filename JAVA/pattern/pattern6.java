package JAVA.pattern;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 1;
        int nst = n/2+1;
        for (int r = 1; r<=n; r++){
            for (int st = 1; st<=nst; st++){
                System.out.print("*\t");

            }
            for (int sp = 1; sp<=nsp; sp++){
                System.out.print("\t");

            }
            for (int st = 1; st<=nst; st++){
                System.out.print("*\t");

            }
            System.out.println();
            if (r<=n/2){
                nsp = nsp+2;
                nst--;
            }
            else{
                nsp = nsp-2;
                nst++;
            }
        }
        scn.close();
    }
}
