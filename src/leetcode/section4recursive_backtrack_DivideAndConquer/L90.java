package leetcode.section4recursive_backtrack_DivideAndConquer;

import java.util.*;

public class L90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        Set<List<Integer>> set_res = new HashSet<>();
        Arrays.sort(nums);
        result.add(item);
        generate(0, nums, item, result, set_res);
        return result;
    }
    public static void generate(int i, int[] nums, List<Integer> item, List<List<Integer>> result, Set<List<Integer>> set_res) {
        if(i >= nums.length)
        {
            return;
        }

        List<Integer> temp1 = new ArrayList<>(item);
        generate(i + 1, nums, temp1, result, set_res);

        List<Integer> temp2 = new ArrayList<>(item);
        temp2.add(nums[i]);
        if(!set_res.contains(temp2))
        {
            result.add(temp2);
            set_res.add(temp2);
        }
        generate(i + 1, nums, temp2, result, set_res);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> subset = subsetsWithDup(nums);
        for(int i = 0 ; i < subset.size() ; i ++)
        {
            System.out.print(subset.get(i));
            System.out.println();
        }
    }
}
