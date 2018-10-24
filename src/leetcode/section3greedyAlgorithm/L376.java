package leetcode.section3greedyAlgorithm;

public class L376
{
    public static int wiggleMaxLength(int[] nums) {
        if(nums.length < 2)
        {
            return nums.length;
        }

        int len = 1;
        final int begin = 0;
        final int up = 1;
        final int down = 2;
        int status = begin;
        for(int i = 1 ; i < nums.length ; i++)
        {
            switch (status)
            {
                case begin:
                    if(nums[i] > nums[i-1])
                    {
                        status = up;
                        len++;
                    }
                    else if(nums[i] < nums[i-1])
                    {
                        status = down;
                        len++;
                    }
                    break;
                case up:
                    if(nums[i] < nums[i-1])
                    {
                        status = down;
                        len++;
                    }
                    break;
                case down:
                    if(nums[i] > nums[i-1])
                    {
                        status = up;
                        len++;
                    }
                    break;
                default:
                    break;
            }
        }
        return len;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(wiggleMaxLength(nums));
    }
}
