package JAVA;
import java.util.*; 
public class adding_2_No {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int[] nums = new int[m];
        for(int i=0; i<nums.length; i++){
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int[] ans = twoSum(nums, target);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        scn.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i, j};
                }
            }
        }
    return null;
    }
}
