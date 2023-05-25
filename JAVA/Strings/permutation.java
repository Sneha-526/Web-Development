package JAVA.Strings;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }
    
    public static void solution(String str){
        int n = str.length();
        int f = factorial(n);
        
        for(int i=0; i<f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div = n; div>=1; div--){
                int r = temp % div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                
                temp = temp/div;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int ans = 1;

        for(int i=n; i>=1; i--){
            ans = ans*i;

        }
        return ans;
    }
}
