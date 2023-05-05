package JAVA.Function_And_Array;
import java.util.*;
public class add_matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the order of 1st matrix:");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr1 = new int[n][m];
        System.out.println("Enter the order of 2nd matrix:");
        int p = scn.nextInt();
        int q = scn.nextInt();
        int [][]arr2 = new int[p][q];
        if(n==p && m==q){
            System.out.println("Enter the elements of 1st matrix:");
            for(int i=0; i<arr1.length; i++) {
                for(int j=0; j<arr1[i].length; j++){
                    arr1[i][j] = scn.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd matrix:");
            for(int i=0; i<arr2.length; i++) {
                for(int j=0; j<arr2[i].length; j++){
                    arr2[i][j] = scn.nextInt();
                }
            }
            int [][]arr3 = new int[n][m];
            for(int i=0; i<arr3.length; i++){
                for(int j=0; j<arr3[i].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("Sum of the matrices are: ");
            for(int i=0; i<arr3.length; i++){
                for(int j=0; j<arr3[i].length; j++) {
                    System.out.println(arr3[i][j]);
                }
            }
        }
        else{
            System.out.println("Addition is not possible.");
        }
        scn.close();
    }
}
