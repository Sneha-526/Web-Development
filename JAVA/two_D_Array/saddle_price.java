package JAVA.two_D_Array;
import java.util.*;
public class saddle_price {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for(int r=0; r<arr.length; r++){
            int mincidx = leastinrow(arr,r);
            int maxridx = maxinminc(arr,mincidx);
            if(maxridx == r){
                System.out.println(arr[maxridx][mincidx]);
                return;
            }
        }
        System.out.println("Invalid input");

        
    }

    public static int maxinminc(int[][] arr, int c) {
        int maxi = arr[0][c];
        int maxr = 0;
        for(int r=1; r<arr.length; r++){
            if(arr[r][c]>maxi){
                maxi = arr[r][c];
                maxr = r;
            }
        }
        return maxr;
    }

    public static int leastinrow(int[][] arr, int r){
        int mini = arr[r][0];
        int minc = 0;
        for(int c=1; c<arr.length;c++){
            if(arr[r][c]<mini){
                mini = arr[r][c];
                minc = c;
            }
        }
        return minc;
    }
}
