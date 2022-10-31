// import java.io.File;

class TestClass {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,2,1};
        // int target = 8;
        System.out.println(findSubarrays(arr));
    }

    public static boolean findSubarrays(int[] nums) {
        
        int sum1 = 0;
        int sum2 = 0;
        
        if (nums.length == 2) 
            return false;
        
        for (int i = 0; i < nums.length - 1; i++) {
            sum1 += (nums[i] + nums[i + 1]);
            for (int j = i + 1; j < nums.length - 2; j++) {
                
                sum2 += (nums[j] + nums[j + 1]);
            
                if (sum1 == sum2)
                    return true;
                
            }
        } 
        return false;
    }
}