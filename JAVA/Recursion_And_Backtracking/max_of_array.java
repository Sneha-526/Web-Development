package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class max_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int ans = max(a,0);
        System.out.println(ans);
        scn.close();
    }

    public static int max(int[] a, int i) {
        if(i == a.length-1){
            return a[i];
        }
        int mroa = max(a,i+1);
        if(a[i]>mroa){
            return a[i];
        }
        else{
            return mroa;
        }
    }


}
