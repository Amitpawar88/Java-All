package DSA.DynamicProgramming;

import java.util.Arrays;

public class FrogJump {

    // Memoization
    public static int frogJump(int idx, int[] height, int[] dp) { // TC -> O(N), SC -> O(N) + O(N);
        if (idx == 0) {
            return 0;
        }
        if (dp[idx] != -1) { // return repetation
            return dp[idx];
        }
        int left = frogJump(idx - 1, height, dp) + Math.abs(height[idx] - height[idx - 1]);
        int right = Integer.MAX_VALUE;
        if (idx > 1) {
            right = frogJump(idx - 2, height, dp) + Math.abs(height[idx] - height[idx - 2]);
        }

        return dp[idx] = Math.min(left, right);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] height = {30, 10, 60, 10, 60, 50};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(frogJump(n, height, dp));
        

        /********************Tabulation***************/
        Arrays.fill(dp, 0);
        // dp[0] = 0;
        int prev1 = 0;  // Space optimization
        int prev2 = 0;

        for (int i = 1; i < n + 1; i++) {
            // int fs = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int fs = prev1 + Math.abs(height[i] - height[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1) {
                // ss = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
                ss = prev2 + Math.abs(height[i] - height[i - 2]);
            }

            // dp[i] = Math.min(fs, ss);
            int curr = Math.min(fs, ss);
            prev2 = prev1;
            prev1 = curr;
        }
        // System.out.println(dp[n]);
        System.out.println(prev1);   
    }
}
