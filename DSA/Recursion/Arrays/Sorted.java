

public class Sorted {
    static boolean isSorted(int[] nums, int index) {

        // base condition
        if (index == nums.length - 1) {
            return true;
        }

        return nums[index] < nums[index + 1] && isSorted(nums, index + 1);
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        
        System.out.println(isSorted(nums, 0));

    }
}
