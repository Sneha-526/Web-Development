package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class first_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a= new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = firstIdx(a,0,x);
        System.out.println(ans);
        scn.close();
    }

    public static int firstIdx(int[] a, int i, int x) {
        if(i==a.length-1){
            return -1;
        }
        int ans = firstIdx(a, i+1, x);
        if(a[i] == x){
            return i;
        }
        else{
            return ans;
        }
    }
}
