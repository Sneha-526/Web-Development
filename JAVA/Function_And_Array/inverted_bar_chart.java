package JAVA.Function_And_Array;
import java.util.Scanner;
public class inverted_bar_chart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        int max = -1;
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
            max = Math.max(a[i],max);
        }
        for(int row = max; row>=1; row--){
            for(int col=a.length-1; col>=0; col--){
                if(a[col]<=row){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
