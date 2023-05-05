package JAVA.Function_And_Array;
import java.util.*;
public class find_element {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to find:");
        int item = scn.nextInt();
        int c = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == item){
                c++;
                break;
            }
        }
        if(c==arr.length){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found");
        }
        scn.close();
    }
}
