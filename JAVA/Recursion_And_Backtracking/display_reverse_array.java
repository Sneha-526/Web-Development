package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class display_reverse_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        displayArr(a,0);
        scn.close();
    }

    public static void displayArr(int[] a, int id) {
        if(id == a.length){
            return;
        }
        displayArr(a,id+1);
        System.out.println(a[id]);
    }
}
