package JAVA;
import java.util.*;
public class inverse_a_no{
    public static void main(String[] args) {
    // write your code here 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        int op = 1;
        while(n>0){
            int od = n%10;
            int ip = od;
            int id = op;

            ans = ans+id*(int)Math.pow(10,ip-1);
            op++;
            n = n/10;
        }
        System.out.println(ans);
        scn.close();
    }
}