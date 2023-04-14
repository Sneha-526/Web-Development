package JAVA.Function_And_Array;
import java.util.Scanner;
public class decimal_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = DecToAny(n,b);
        System.out.println(res);
        scn.close();
    }
    public static int DecToAny(int n, int b) {
        int ans = 0;
        int power = 1;
        while (n != 0){
            int r = n % b;
            n /= b;
            ans += (r* power);
            power *= 10;
        }
        return ans;
    }
}
