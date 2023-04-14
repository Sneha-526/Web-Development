package JAVA.pattern;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=n; i>=n; i--) {
            for(int k=1; k<=n; k++) {
                if(i==k)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
