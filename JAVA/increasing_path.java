package JAVA;
import java.util.*;
public class increasing_path {
    static int mod = (int) Math.pow(10,9) + 7;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] grid = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = scn.nextInt();
            }
        }
        int ans = countPaths(grid);
        System.out.println(ans);
        scn.close();
    }

    public static int helper(int m, int n, int[][]grid, int[][]dp, int p){
        int rows = grid.length;
        int cols = grid[0].length;
        if(m<0 || m>=rows || n<0 || n>=cols || grid[m][n] <= p){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int down = helper(m + 1, n, grid, dp, grid[m][n]) % mod;
        int up = helper(m - 1, n, grid, dp, grid[m][n]) % mod;
        int right = helper(m, n + 1, grid, dp, grid[m][n]) % mod;
        int left = helper(m, n - 1, grid, dp, grid[m][n]) % mod;

        return dp[m][n] = (down + up + right + left + 1) % mod;

    }   

    public static int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j] == -1){
                    helper(i,j,grid,dp,-1);
                }
            }
        }
        
        int path = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                path = (path + dp[i][j]) % mod;
            }
        }

        return path;
    }
}

