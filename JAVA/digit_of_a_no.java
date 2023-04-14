package JAVA;
import java.util.*;
public class digit_of_a_no{ 
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int num = n;
      int count = 0;
      
      while(n>0){
        n = n/10;
        count++;
      }
      int div = (int) Math.pow(10,count-1);

      while(div>0){
        int dig = num/div;
        System.out.println(dig);
        num = num%div;
        div = div/10;
      }
      scn.close();
    }
}