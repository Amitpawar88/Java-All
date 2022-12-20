public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 3, 5, 4, 2, 1, 1};
        System.out.println(findUnique(nums));
    }

    public static int findUnique(int[] nums) {
        int unique = 0;

        for (int i : nums) {
            unique ^= i;
        }

        return unique;
    }
}
