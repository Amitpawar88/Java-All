package Questions;

import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        // System.out.println(set.size()); // 7

        set.clear();

        // Intersection

        for (int i : arr1) {
            set.add(i);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println(count);
    }
}
