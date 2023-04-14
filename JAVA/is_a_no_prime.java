package JAVA;
import java.util.Scanner;
  
  public class is_a_no_prime{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int f = 0;
    for(int i=1;i<=num;i++){
      if(num%i==0)
        f++;
    }
    if(f==2)
      System.out.print("It is a prime number");
    else
      System.out.print("It is not a prime number");
    scn.close();
  }
}