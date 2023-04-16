package JAVA.Function_And_Array;
import java.util.Scanner;
public class difference_of_2_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 =scn.nextInt();
        int []a = new int[n1];
        for(int i=0; i<a.length; i++){
            a[i]  = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int []b = new int[n2];
        for(int i=0; i<b.length; i++){
            b[i] = scn.nextInt();
        }

        int []ans = new int[n1>n2?n1:n2];
        int c =0;
        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;
        while(k>=0){
            int diff = 0;
            int av = i>=0 ? a[i] : 0;
            if(b[j] - a[i] +c >=0){
                diff = b[j] - a[i] +c;
                c=0;
            }
            else{
                diff = b[j] + 10 - a[i] + c;
                c = -1;
            }
            ans[k] = diff;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx < ans.length && ans[idx]==0){
            idx++;
        }
        while(idx < ans.length){
            System.out.print(ans[idx++] + " ");
        }

        for(int val:ans){
            System.out.print(val + " ");
        }
        scn.close();
    }
}
