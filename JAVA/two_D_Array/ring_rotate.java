package JAVA.two_D_Array;
import java.util.*;
public class ring_rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = scn.nextInt();

            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateshell(arr,s,r);
        display(arr);
        scn.close();
   }

   
   public static void rotateshell(int [][]arr, int s, int r){
       int []oned = fillOned(arr,s);
        rotate(oned,r);
        fillshell(arr,s,oned);
   }

   public static int[] fillOned(int[][] arr, int s) {
       int minr = s-1;
       int minc = s-1;
       int maxr = arr.length-s;
       int maxc = arr[0].length-s;
       int sz = 2 * (maxr - minr + maxc - minc);

       int []oned = new int[sz];
       int idx = 0; 
       for(int i=minr, j=minc; i<=maxr; i++){
        oned[idx] = arr[i][j];
        idx++;
       }
       
       for(int i= maxr, j=minc + 1; j<=maxc; j++){
        oned[idx] = arr[i][j];
        idx++;
    }

       for(int i=maxr - 1, j=maxc; i>=minr; i--){
           oned[idx] = arr[i][j];
        idx++;
       }
       
       for(int i=minr, j=maxc - 1; j>=minc + 1; j--){
            oned[idx] = arr[i][j];
            idx++;
       }


       return oned;
    }
   
    public static void fillshell(int[][] arr, int s, int[] oned) {
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;

        int idx = 0; 
        for(int i=minr, j=minc; i<=maxr; i++){
            arr[i][j] = oned[idx];
            idx++;
        }

        for(int i= maxr, j=minc + 1; j<=maxc; j++){
            arr[i][j] = oned[idx];
            idx++;
        }

        for(int i=maxr - 1, j=maxc; i>=minr; i--){
            arr[i][j] = oned[idx];
            idx++;
        }

        for(int i=minr, j=maxc - 1; j>=minc + 1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }
    }

    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if(r<0){
            r = r + oned.length;
        }
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }

    public static void reverse(int[] oned, int li, int ri) {
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            
            li++;
            ri--;
        }
    } 
    
    
    public static void display(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
