package JAVA.Strings;
import java.util.*;
public class palindromic_substrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);
        scn.close();
    }

    public static void solution(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String sub = str.substring(i, j);
                if(ispali(sub)==true){
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean ispali(String s){
        int i=0, j=s.length()-1;

        while(i<j){
            char st = s.charAt(i);
            char end = s.charAt(j);

            if(st!=end){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
