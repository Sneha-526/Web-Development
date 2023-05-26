package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class print_zig_zag{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        scn.close();
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);

    }
}