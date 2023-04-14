package JAVA.Function_And_Array;
import java.util.Scanner;
public class digit_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int num, int dig) {
        int count = 0;
        while (num>0){
            int rem = num%10;
            if (rem == dig){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
