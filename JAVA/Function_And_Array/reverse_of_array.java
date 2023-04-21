package JAVA.Function_And_Array;
import java.util.Scanner;
public class reverse_of_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i<n/2){
                int temp = a[i];
                a[i] = a[n-i-1];
                a[n-i-1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        scn.close();
    }
}
