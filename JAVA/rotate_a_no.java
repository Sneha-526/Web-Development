package JAVA;
import java.util.*;  
public class rotate_a_no{
   public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int num = n;
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        k = k%count;
        if (k<0){
            k = k+count;
        }
        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,count-k);
        int quo = n/div;
        int rem = n%div;
        int ans = rem*mul+quo;
        System.out.println(ans);
        scn.close();
    }
}