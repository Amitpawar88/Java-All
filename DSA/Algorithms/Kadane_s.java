public class Kadane_s {

    static int kadaneAlgo(int nums[]) {
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] nums = {3, -11, 44, 3, -5, 2};
        System.out.println(kadaneAlgo(nums));
    }
}