package DSA.DynamicProgramming;

import java.util.Arrays;

public class FrogJumpK_Distance {

    /*************   Memoization   *************/
    /*
     * TC -> O(N * K)
     * SC -> O(N) + O(N) -> O(N)
     */
    public static int frogJumpKDist(int idx, int[] height, int[] dp, int k) {
        if (idx == 0) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int mmSteps = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if (idx - i >= 0) {
                int jump = frogJumpKDist(idx - i, height, dp, k) + Math.abs(height[idx] - height[idx - i]);
                mmSteps = Math.min(jump, mmSteps);
            }
        }

        return dp[idx] = mmSteps;
     }

    /**************   Tabulation   ****************/ 
    /*
     * TC -> O(N * K)
     * SC -> O(N)
     */
    public static int tabulationK(int n, int[] height, int[] dp, int k) {
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i]= mmSteps;
        }

        return dp[n - 1];
    }


    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        int k = 3;
        int[] dp = new int[height.length];
        Arrays.fill(dp, -1);

        // System.out.println(frogJumpKDist(height.length - 1, height, dp, k));
        System.out.println(tabulationK(height.length, height, dp, k));
    }
}
