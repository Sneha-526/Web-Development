package JAVA.pattern;
import java.util.Scanner;
public class pattern13 {
    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        for(int i=0; i<n; i++) {
            int x = 1;
            for(int j=0; j<nst; j++) {
                System.out.print(x + "\t");
                x = (x * (i - j))/ (j + 1);
            }
            nst++;
            System.out.println();
        }
        scn.close();
    }
}
