package JAVA.Function_And_Array;
import java.util.Scanner;
public class Any_base_to_any_base {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int res = AnyToAny(n, b1, b2);
        System.out.println(res);
        scn.close();
    }
    public static int AnyToAny(int n, int b1, int b2 ){
        int dec = AnyToDec(n,b1);
        int dn = DecToAny(dec, b2);
        return dn;
    }
    public static int AnyToDec(int n, int b1){
        int ans = 0;
        int power = 1;
        while(n!=0){
            int r = n%10;
            n = n/10;
            ans = ans + (r * power);
            power = power * b1;
        }
        return(ans);
    }
    public static int DecToAny(int n, int b2){
        int ans = 0;
        int power = 1;
        while (n != 0){
            int r = n % b2;
            n /= b2;
            ans += (r* power);
            power *= 10;
        }
        return ans;
    }
}
