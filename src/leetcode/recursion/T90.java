package leetcode.recursion;

import java.util.*;

public class T90 {
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		for(int i : nums) { System.out.println(i); }
		List<List<Integer>> lli = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		Set<List<Integer>> sli = new HashSet<>();
		sli.add(li);
		lli.add(li);
		int index = 0;
		subsetsCore(nums , lli , sli ,index);
		return lli;
	}
	public static void subsetsCore(int[] nums,List<List<Integer>> lli , Set<List<Integer>> sli , int index)
	{
		if(index == nums.length)
		{
			return;
		}
		List<Integer> li = new ArrayList<>(lli.get(lli.size() - 1)) ;
		/*if(!sli.contains(li))
		{
			
		}*/
		subsetsCore(nums , lli , sli , index+1);
		if(index == 0)
		{
			li.add(nums[index]);
		}
		if(index != 0 && nums[index] != nums[index - 1])
		{
			li.add(nums[index]);
		}
		
		
		//Collections.sort(li);
		/*if(!sli.contains(li))
		{
			
		}*/
		sli.add(li);
		lli.add(li);
		subsetsCore(nums , lli , sli , index+1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		for (int i = 1; i < 4; i++) {
			nums[i - 1] = i;
		}
		nums[3] = 2;
		//Arrays.sort(nums);
		
		//for(int i : nums) { System.out.println(i); }
		 
		List<List<Integer>> lli = subsetsWithDup(nums);
		for (List<Integer> li : lli) {
			System.out.println(li);
		}
	}

}
