package JAVA.two_D_Array;
import java.util.*;
public class search_in_sorted_2d_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++){
                 arr[i][j] = scn.nextInt();
            }
        }
        int item = scn.nextInt();
        int c= 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(item == arr[i][j]){
                    c++;
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("Not Found");
        }
        scn.close();
    }
}
