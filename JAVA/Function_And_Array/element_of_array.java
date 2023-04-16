package JAVA.Function_And_Array;
import java.util.Scanner;
public class element_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int temp = scn.nextInt();
        for(int i=0; i<arr.length; i++) {
            if(temp == arr[i]){
                System.out.println(i);
                break;
            }
            if(i==arr.length-1){
                System.out.println("-1");
            }
        }
        scn.close();
    }
}
