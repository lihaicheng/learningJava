package leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class T78 {
	public static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> lli = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		lli.add(li);
		int index = 0;
		subsetsCore(nums , lli /*, li*/ ,index);
		return lli;
	}
	public static void subsetsCore(int[] nums,List<List<Integer>> lli/*, List<Integer> li*/ , int index)
	{
		if(index == nums.length)
		{
			return;
		}
		List<Integer> li = /*lli.isEmpty() ? new ArrayList<>() : */new ArrayList<>(lli.get(lli.size() - 1)) ;
		/*for(int i = 0 ; i <= index ; i++)
		{
			li.add(nums[i]);
		}*/
		//lli.add(li);
		index++;
		subsetsCore(nums , lli /*, li*/ , index);
		index--;
		li.add(nums[index]);
		lli.add(li);
		index++;
		subsetsCore(nums , lli /*, li*/ , index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[3];
		for(int i = 1 ; i < 4 ; i++)
		{
			nums[i-1] = i;
		}
		/*for(int i : nums)
		{
			System.out.println(i);
		}*/
		List<List<Integer>> lli = subsets(nums);
		for(List<Integer> li : lli)
		{
			System.out.println(li);
		}
		
	}

}
