package leetcode.section4recursive_backtrack_DivideAndConquer;

import java.util.*;

public class L40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        Set<List<Integer>> set_res = new HashSet<>();
        int sum = 0;
        Arrays.sort(candidates);
        generate(0, candidates, item, result, set_res, sum, target);
        return result;
    }
    public static void generate(int i, int[] candidates, List<Integer> item,
                                List<List<Integer>> result, Set<List<Integer>> set_res, int sum, int target) {
        if(i >= candidates.length || sum >= target)
        {
            return;
        }

        List<Integer> temp1 = new ArrayList<>(item);
        generate(i + 1, candidates, temp1, result, set_res, sum, target);

        List<Integer> temp2 = new ArrayList<>(item);
        temp2.add(candidates[i]);
        sum += candidates[i];
        if(sum == target)
        {
            if(!set_res.contains(temp2))
            {
                result.add(temp2);
                set_res.add(temp2);
            }
        }
        else
        {
            generate(i + 1, candidates, temp2, result, set_res, sum, target);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> subset = combinationSum2(candidates, target);
        for(int i = 0 ; i < subset.size() ; i ++)
        {
            System.out.print(subset.get(i));
            System.out.println();
        }
    }

}
