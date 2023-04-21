package JAVA.Function_And_Array;
import java.util.Scanner;
public class inverse_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        int []ans = new int[a.length];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        for(int i=0; i<n; i++){
            int val = a[i];
            ans[val] = i;
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
