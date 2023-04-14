package JAVA.pattern;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n-1;
        for (int i = 1; i <= n; i++) {
            for(int k=1;k<=sp;k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
        }
        scn.close();
    }
    
}
