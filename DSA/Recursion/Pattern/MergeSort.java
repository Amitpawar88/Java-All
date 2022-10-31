package Pattern;

import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length/ 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; 
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
       
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j]; 
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 4, 6, 7};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
