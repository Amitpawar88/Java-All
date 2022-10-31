

import java.util.ArrayList;

public class LinearSearch {
    static boolean linearSearch(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }

        return nums[index] == target || linearSearch(nums, target, index + 1);

    }

    // static ArrayList<Integer> list = new ArrayList<>();
     
    static void findAllIndex(int[] nums, int target, int index) {

        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
         //   list.add(index);
        } 
        findAllIndex(nums, target, index + 1);
        
    }

    static ArrayList<Integer> findAllIndexViaArrayList(int[] nums, int target, int index, ArrayList<Integer> list) {

        if (index == nums.length) {
            return list; 
        }
        if (nums[index] == target) {
            list.add(index);
        } 
        return findAllIndexViaArrayList(nums, target, index + 1, list);
        
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 5, 6};
        
        // System.out.println(linearSearch(nums, 7, 0));
        // findAllIndex(nums, 5, 0);
        // System.out.println(list);
        System.out.println(findAllIndexViaArrayList(nums, 5, 0, new ArrayList<>()));
    }
}
 