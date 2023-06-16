package JAVA;
import java.text.NumberFormat;
import java.util.*;
public class currency_formatter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        String val1 = nf1.format(n);
        System.out.println("US: " + val1);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale ("en", "in"));
        String val2 = nf2.format(n);
        System.out.println("India: " + val2);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        String val3 = nf3.format(n);
        System.out.println("China: " + val3);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        String val4 = nf4.format(n);
        System.out.println("France: " + val4);
    }
}
