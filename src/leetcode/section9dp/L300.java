package leetcode.section9dp;

public class L300 {
    public static int lengthOfLIS1(int[] nums) {
        if (nums.length < 2)
        {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        int maxlen = 1;
        dp[0] = 1;
        for (int i = 1 ; i < nums.length ; i++)
        {
            dp[i] = 1;
            for (int j = i-1 ; j >= 0 ; j--)
            {
                if (nums[i] > nums[j])
                {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
            maxlen = max(maxlen, dp[i]);
        }
        return maxlen;

    }
    public static int max(int a , int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length < 2)
        {
            return nums.length;
        }
        int[] stack = new int[nums.length];
        stack[0] = nums[0];
        int maxlen = 0;
        for (int i = 1 ; i < nums.length ; i++)
        {
            if (stack[maxlen] < nums[i])
            {
                maxlen++;
                stack[maxlen] = nums[i];
            }
            else
            {
                int start = 0;
                int end = maxlen;
                while (start <= end)
                {
                    int mid = (start + end)/2;
                    if (stack[mid] >= nums[i])
                    {
                        if (mid == 0 || stack[mid-1] < nums[i])
                        {
                            stack[mid] = nums[i];
                            break;
                        }
                        else
                        {
                            end = mid - 1;
                        }
                    }
                    else
                    {
                        start = mid + 1;
                    }
                }
//                for (int j = 0 ; j <= maxlen ; j++)
//                {
//                    if (stack[j] >= nums[i])
//                    {
//                        stack[j] = nums[i];
//                        break;
//                    }
//                }
            }
        }
        return maxlen + 1;

    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = lengthOfLIS(nums);
        System.out.print(result);
    }
}
