// STRING METHODS...
package JAVA;
import java.util.*;
public class Sting2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        //LENGTH OF THE STRING.
        int val = name.length();
        System.out.println(val);
        //LOWER CASE CONVERSION.
        String lower = name.toLowerCase();
        System.out.println(lower);
        //UPPER CASE CONVERSION.
        String upper = name.toUpperCase();
        System.out.println(upper);
        scn.close();
        //TRIMMING METHOD.
        String ntString = "     Hello     ";
        System.out.println(ntString);
        System.out.println(ntString.trim());
        //SUBSTRING METHOD.
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 5));
        //REPLACE METHOD.
        System.out.println(ntString.replace("Hello", "Bye"));
        //STARTSWITH AND ENDSWITH METHOD.
        System.out.println(name.startsWith("sn"));
        System.out.println(name.endsWith("ha"));
        //CHARAT METHOD.
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("n"));
        System.out.println(name.indexOf("ha",1));
        //EQUAL METHOD.
        System.out.println(name.equals("sneha"));
    }
}
