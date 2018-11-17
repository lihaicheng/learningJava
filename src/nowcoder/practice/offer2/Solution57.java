package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution57 {
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		
		int end = array.length - 1;
		if(sum > array[end] * 2 || sum < array[0] * 2 || end == -1)
		{
			return null;
		}
		int start = 0;
		ArrayList<Integer> ai = new ArrayList<Integer>();
		while(array[end] > sum)
		{
			end--;
		}
		int tempend = end;
		while(array[end] + array[start] != sum)
		{
			if(array[end] + array[start] < sum)
			{
				if(start < end)
				{
					start++;
				}
				else
				{
					end--;
					start = 0;
				}
				
			}
			else if(array[end] + array[start] > sum)
			{
				if(start < end)
				{
					end--;
				}
				else
				{
					start++;
					end = tempend;
				}
				
			}
			if(end == -1)
			{
				return null;
			}
		}
		
		ai.add(array[start]);
		ai.add(array[end]);
		return ai;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1,2 ,6};
		int sum = 5 ; 
		System.out.println(FindNumbersWithSum(array, sum));
	}

}
