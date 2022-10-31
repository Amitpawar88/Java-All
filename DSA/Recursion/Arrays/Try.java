import java.util.Arrays;

public class Try {
    public static void main(String[] args)  {
        // int[] nums = {5, 6, 1, 2, 3};
        // System.out.println(Arrays.toString(toMerge(nums)));

        phonePad("", "12");
    }

    static int[] toMerge(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;
        
        int[] first = toMerge(Arrays.copyOfRange(nums, 0, mid));
        int[] second = toMerge(Arrays.copyOfRange(nums, mid, nums.length));

        return isSorted(first, second);
    }

    static int[] isSorted(int[] first, int[] second) {
        
        int[] sorted = new int[first.length + second.length];

        int i = 0; 
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                sorted[k] = first[i];
                i++;
                k++;
            } else {
                sorted[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length) {
            sorted[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            sorted[k] = second[j];
            j++;
            k++;
        }

        return sorted;
    }

    static void phonePad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }
 }
