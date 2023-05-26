package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class display_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        displayArr(a,n);
        scn.close();
    }

    public static void displayArr(int[] a, int n) {
        if(n == 0){
            System.out.println(a[0]);
            return;
        }
        displayArr(a,n-1);
        System.out.println(a[n]);
    }

    /*  If called function is -> displayArr(a,0);
    public static void displayArr(int[] a, int id) {
        if(id == a.length){
            return;
        }
        System.out.println(a[id]);
        displayArr(a,id+1);
    } */
}
