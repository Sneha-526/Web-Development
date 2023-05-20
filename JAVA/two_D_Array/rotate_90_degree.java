package JAVA.two_D_Array;
import java.util.*;
public class rotate_90_degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]a = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for(int r=0; r<a.length; r++){
            int i=0, j=a[0].length-1;
            while(i<j){
                int t = a[r][i];
                a[r][i] = a[i][r];
                a[i][r] = t;

                i++;
                j--;
            }
        }
        scn.close();
    }
}
