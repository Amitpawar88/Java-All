package DSA.DynamicProgramming;

import java.util.Arrays;

public class NinjasTraining {

    /*************************  Memoization  *************************/
    /*
    * Time Complexity: O(N*4*3)
    * Space Complexity: O(N) + O(N*4)
    */
    public static int ninjaTraning(int day, int last, int[][] points, int[][] dp) {
        if (dp[day][last] != -1) return dp[day][last];
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, points[0][i]);
                }
            }
            return dp[day][last] = maxi;
        }

        int maxi = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + ninjaTraning(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity);
            }
        }

        return dp[day][last] = maxi;
    }

    public static void main(String[] args) {
        int[][] points = {{10,40,70},
                          {20,50,80},
                          {30,60,90}};
        int dp[][] = new int[points.length][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }    
        
        System.out.println(ninjaTraning(points.length - 1, 3, points, dp));
    }
}
