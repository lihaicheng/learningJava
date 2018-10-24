package leetcode.section3greedyAlgorithm;

public class L55 {
    public static boolean canJump(int[] nums) {
        int max_index = nums[0];
        int jump = 0;
        for(;jump < nums.length ; jump++)
        {
            nums[jump] = nums[jump] + jump ;
            if(jump <= max_index)
            {
                max_index = max_index > nums[jump] ? max_index : nums[jump];
                continue;
            }
            break;
        }
        if(jump > nums.length - 1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};//{2,4,3,4,8}
        System.out.println(canJump(nums));
    }
}
