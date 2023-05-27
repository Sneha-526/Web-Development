package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class last_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = lastIdx(a,0,x);
        System.out.println(ans);
        scn.close();
    }

    public static int lastIdx(int[] a, int i, int x) {
        if(i==a.length){
            return -1;
        }
        int ans = lastIdx(a, i+1, x);
        if(ans!=-1){
            return ans;
        }
        else if(i==x){
            return i;
        }
        else{
            return -1;
        }
    }
}
