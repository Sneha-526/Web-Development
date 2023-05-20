package JAVA.two_D_Array;
import java.util.Scanner;
public class matrix_multiplication {
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
        int p = scn.nextInt();
        int q = scn.nextInt();
        int [][]b = new int[p][q];
        for(int i=0; i<p; i++) {
            for(int j=0; j<q; j++){
                b[i][j] = scn.nextInt();
            }
        }
        if(m != p){
            System.out.println("Matrix cannot be multiplied");
        }
        else{
            int [][]c = new int[n][q];
            for(int i=0; i<n; i++) {
                for(int j=0; j<q; j++) {
                    int sum = 0;
                    for(int k=0; k<p; k++) {
                        sum += a[i][k]*b[k][j];
                    }
                    c[i][j] = sum;
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        scn.close();
    }
}
