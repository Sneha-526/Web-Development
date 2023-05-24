package JAVA.Strings;
import java.util.*;
public class delaraction_of_string {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        //Initialising a String -->
        String str = "hello";
        System.out.println(str);
       
        //Another way to initialise a String -->
        String str1 = new String ("hello");
        System.out.println(str1);
       
        //Declaring a String --> 
        // String a = scn.next();  //Takes only one word (Does not takes space as Character)
        // System.out.println(a);
        
        //Another way to declare -->
        String b = scn.nextLine();  //Takes whole sentence/Line.
        System.out.println(b);
        
        scn.close();
    }
}
