package leetcode.section9dp;

public class L198 {
    public static int rob(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1)
        {
            return nums[0];
        }
        int[] res = new int[nums.length + 3];
        res[0] = nums[0];
        res[1] = (nums[1] > nums[0]) ? nums[1] : nums[0];
        for(int i = 2 ; i < nums.length ; i ++)
        {
            res[i] = (res[i-1] > (res[i-2] + nums[i])) ? res[i-1] : (res[i-2] + nums[i]);
        }
        return res[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int res = rob(nums);
        System.out.print(res);
    }
}
