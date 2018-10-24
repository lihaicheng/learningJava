package leetcode.section4recursive_backtrack_DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class L78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        result.add(item);
        generate(0, nums, item, result);
        return result;
    }
    public static void generate(int i, int[] nums, List<Integer> item, List<List<Integer>> result) {
        if(i >= nums.length)
        {
            return;
        }

        List<Integer> temp1 = new ArrayList<>(item);
        generate(i + 1, nums, temp1, result);

        List<Integer> temp2 = new ArrayList<>(item);
        temp2.add(nums[i]);
        result.add(temp2);
        generate(i + 1, nums, temp2, result);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> subset = subsets(nums);
        for(int i = 0 ; i < subset.size() ; i ++)
        {
            System.out.print(subset.get(i));
            System.out.println();
        }

    }
}
