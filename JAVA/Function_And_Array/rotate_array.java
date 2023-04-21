package JAVA.Function_And_Array;
import java.util.Scanner;
public class rotate_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(a,k);
        for(int i=0; i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        scn.close();
    }
      public static void rotate(int []a, int k){
        k = k % a.length;
        if(k<0){
            k += a.length;
        }
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
      }
      public static void reverse(int []a, int li, int ri){
        while(li<ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
      }
}