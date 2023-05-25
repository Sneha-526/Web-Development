package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
        scn.close();
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int f1 = factorial(n-1);
        int f = f1 * n;
        return f;
    }
}
