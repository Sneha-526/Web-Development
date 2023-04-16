
//SPAN OF ARRAY IS THE DIFF OF MAXIMUM ELEMENT FROM MINIMUM ELEMENT OF THE ARRAY.
//i.e span = max - min
package JAVA.Function_And_Array;
import java.util.Scanner;
public class span_of_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
        scn.close();
    }
}
