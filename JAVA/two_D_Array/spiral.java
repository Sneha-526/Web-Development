package JAVA.two_D_Array;
import java.util.*;
public class spiral {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minrow = 0, maxrow = n-1;
        int mincol = 0, maxcol = m-1;
        int a = n*m;
        while(a>0){
            for(int i=minrow; i<=maxrow && a>0; i++){
                System.out.println(arr[i][mincol]);
                a--;
            }
            mincol++;
            for(int j=mincol; j<=maxcol && a>0; j++){
                System.out.println(arr[maxrow][j]);
                a--;
            }
            maxrow--;
            for(int i=maxrow; i>=minrow && a>0; i--){
                System.out.println(arr[i][maxcol]);
                a--;
            }
            maxcol--;
            for(int j=maxcol; j>=mincol && a>0; j--){
                System.out.println(arr[minrow][j]);
                a--;
            }
            minrow++;
        }
        scn.close();
    }
}
