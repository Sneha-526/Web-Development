package JAVA.Function_And_Array;
import java.util.Scanner;
public class Any_base_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }
    public static int getProduct(int b, int n1, int n2){
        int ans = 0, mul = 1;
        while(n2>0){
            int d2 = n2%10;
            n2 /= 10;
            int pwsd = singledigproduct(b, n1, d2);
            ans = getSum(b, ans, pwsd*mul);
            mul = mul*10; 
        }
        return ans;
    }
    public static int singledigproduct(int b, int n1, int d2){
        int carry = 0, mul = 1, ans = 0;
        while(n1>0 || carry>0){
            int d1 = n1%10;
            n1 = n1/10;
            int multiply = d1*d2+carry;
            carry = multiply/b;
            multiply = multiply%b;
            ans = ans + multiply*mul;
            mul = mul*10;
        }
        return ans;
    }
    public static int getSum(int b, int n1, int n2){
        int ans = 0, mul = 1, carry = 0;
        while(n1>0 || n2>0 || carry>0){
            int d1 = n1%10;
            n1/=10;
            int d2 = n2%10;
            n2/=10;
            int sum = d1 + d2 +carry;
            int dig = sum%b;
            carry = sum/b;
            ans = ans + dig*mul;
            mul = mul*10;
        }
        return(ans);
    }
}