package JAVA.Function_And_Array;
import java.util.Scanner;
public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = AnyToDec(n,b);
        System.out.print(res);
        scn.close();
    }
    public static int AnyToDec(int n, int b) {
        int ans = 0;
        int power = 1;
        while ( n>0){
            int digit = n%10;
            ans +=digit*power;
            power*=b;
            n = n/10;
        }
        return ans;
    }
}
