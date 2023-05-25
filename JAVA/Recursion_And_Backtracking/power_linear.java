package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class power_linear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = powerLinear(x,n);
        System.out.println(p);
        scn.close();
    }

    public static int powerLinear(int x, int n) {
        if(n==0){
            return 1;
        }

        int p1 = powerLinear(x,n-1);
        int p = p1 * x;
        return p;
    }
    
}
