package DSA.DynamicProgramming;

import java.util.Arrays;

public class NonAdjecentMaxSum {

    /**************  Tabulation  ****************/
    public static int rob1(int[] nums) {
    
        int prev1 = nums[0];
        int prev2 = 0;
        
        for (int i = 1; i < nums.length; i++) {
            int rob = nums[i];
            if (i > 1) {
                rob += prev2;
            }
            int notRob = 0 + prev1;
            
            int curr = Math.max(rob, notRob);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }

    /************************  Memoization  ***********************/
    /*
     * TC -> O(N)
     * SC -> O(N) + O(N) -> O(N)
     */
    public static int rob(int[] nums) { // 
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        
        return helper(n - 1, nums, dp);
    }
    
    public static int helper(int idx, int[] nums, int[] dp) {
        if (idx == 0) {
            return nums[idx];
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        
        int pick = nums[idx] + helper(idx - 2, nums, dp);
        int notPick = 0 + helper(idx - 1, nums, dp);
        
        return dp[idx] = Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4 ,9};

        System.out.println(rob(nums));
        System.out.println(rob1(nums));
    }
}
