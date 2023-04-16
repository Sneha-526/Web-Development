package JAVA.Function_And_Array;
import java.util.Scanner;
public class sum_of_2_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int []a = new int[n1];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.println();
        int n2 = scn.nextInt();
        int []b = new int[n2];
        for(int i=0; i<b.length; i++){
            b[i] = scn.nextInt();
        }
        int []ans = new int[n1>n2?n1:n2];
        int carry = 0;
        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;
        while(i>=0 || j>=0){
            int sum = carry;

            if(i>=0){
                sum = sum+a[i];
            }
            if(j>=0){
                sum = sum+b[j];
            }
            carry = sum/10;
            sum = sum%10;

            ans[k] = sum;
            i--;
            j--;
            k--;
        }
        if(carry>0){
            System.out.print(carry + " ");
        }
        for(int val:ans){
            System.out.print(val + " ");
        }
        scn.close();
    }
}
