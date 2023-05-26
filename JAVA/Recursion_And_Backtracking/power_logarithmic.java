package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class power_logarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
        
        scn.close();
    }

    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int recans = power(x,n/2);
        int ans = recans * recans;
        if(n%2 == 1){
            ans = ans * x;
        }

        return ans;
    }
}
