package JAVA.Recursion_And_Backtracking;
import java.util.*;
public class get_subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);

        scn.close();
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String a = str.substring(1);
        ArrayList<String> recans = gss(a);

        ArrayList<String> myans = new ArrayList<>();

        for(String s:recans){
            myans.add(s);
        }
        for(String s:recans){
            myans.add(ch+s);
        }
        return myans;
    }
    
}
