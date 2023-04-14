package JAVA.pattern;
import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;
        int x = 1;
        for (int i=1; i<=n; i++){
            for (int sp=1; sp<=nsp; sp++){
                System.out.print("\t");
            }
            int v = x;
            for (int st=1; st<=nst; st++){
                System.out.print(v + "\t");
                if(st<=nst/2){
                    v++;
                }
                else{
                    v--;
                }
            }
            System.out.println();
            if (i<=n/2){
                nst = nst+2;
                nsp--;
                x++;
            }
            else{
                nst-=2;
                nsp++;
                x--;
            }
        }
        scn.close();
    }
}
