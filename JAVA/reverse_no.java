package JAVA;
import java.util.*;   
public class reverse_no {
   
    public static void main(String[] args) {
    // write your code here
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();

        while(n>0){
        int rem = n%10;
        System.out.println(rem);
        n = n/10;
        }
        scn.close();
    }
}