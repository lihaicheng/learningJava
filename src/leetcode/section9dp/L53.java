package leetcode.section9dp;

public class L53 {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            dp[i] = ((dp[i - 1] + nums[i]) < nums[i]) ? nums[i] : (dp[i - 1] + nums[i]);
            //System.out.println(dp[i]);
            if(res < dp[i])
            {
                res = dp[i];
                //System.out.print(res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.print(res);
    }
}
