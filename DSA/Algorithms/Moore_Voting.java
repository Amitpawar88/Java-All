public class Moore_Voting {
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,2,4,3,3,2};

        System.out.println(mooreVoting(nums));
    }

    static int mooreVoting(int[] nums) {

        int count = 0;
        int temp = 0;

        for (int num : nums) {
            if (count == 0) temp = num;

            if (temp == num) count++;
            else count--;
        }
        return temp;
    }
}