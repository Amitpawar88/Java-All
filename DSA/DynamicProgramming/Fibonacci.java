package DSA.DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;

        int[] dp = new int[num + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(fibonacci(num, dp));
    }

    public static int fibonacci(int num, int[] dp) {
        if (num <= 1) {
            return num;
        }
        if (dp[num] != -1) {
            return dp[num];
        }

        return dp[num] = fibonacci(num - 1, dp) + fibonacci(num - 2, dp);

    }
}