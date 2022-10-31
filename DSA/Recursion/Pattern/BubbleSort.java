package Pattern; 

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] nums, int s, int e) {
        if (e == 0) {
            return;
        }

        if (s < e) {
            if (nums[s] > nums[s + 1]) {
                int temp = nums[s];
                nums[s] = nums[s + 1];
                nums[s + 1] = temp;
            }
            bubbleSort(nums, s+1, e);
        } else {
            bubbleSort(nums, 0, e-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {6, 3, 23, 54, 4, 1};
        bubbleSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
