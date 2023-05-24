package JAVA.Strings;
import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder(str);

        sb.length(); // to get length
        sb.append('s');  // to add at last
        sb.insert(1,'d');  // to insert in between
        sb.setCharAt(0,'g');  // to change character
        sb.deleteCharAt(0);  // to delete a specific index

        System.out.println(sb);

        scn.close();
    }
}
