package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class all_indices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();

        int[] ans = index(a,x,0,0);
        if(ans.length == 0){
            System.out.println("NO OUTPUT");
            return;
        }

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]); 
        }

    }

    public static int[] index(int[] a, int x, int i, int count) {
        if(i == a.length){
            int[] base = new int[count];
            return base;
        }
        if(a[i] == x){
            count++;
        }
        int[] arr = index(a,x,i+1,count);
        if(a[i] == x){
            arr[count-1] = i;
            return arr;
        }
        else{
            return arr;
        }
    }
}
