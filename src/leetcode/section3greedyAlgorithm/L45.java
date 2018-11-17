package leetcode.section3greedyAlgorithm;

public class L45 {
    public static int jump(int[] nums) {
        if(nums.length < 2)
        {
            return 0;
        }
        int jump_min = 1;
        int current_max_index = nums[0];
        int pre_max_index = nums[0];

        for (int i = 0 ; i < nums.length ; i++)
        {
            if(i > current_max_index)
            {
                jump_min++;
                current_max_index = pre_max_index;
            }
            if(pre_max_index < nums[i] + i)
            {
                pre_max_index = nums[i] + i;
            }

        }
        return jump_min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};//{2,4,3,4,8}
        System.out.println(jump(nums));
    }
}
