package leetcode.section9dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L120 {
    public static int minimumTotal1(List<List<Integer>> triangle) {
    	// 这里是从上到下考虑的
    	int size = triangle.size();//size == 4
    	int[][] score  = new int[size][size];
    	score[0][0] = triangle.get(0).get(0);
    	for(int i = 1 ; i < size ; i++)
    	{
    		score[i][0] = score[i-1][0] + triangle.get(i).get(0);
    	}
    	/*for(int i = 0 ; i < size ; i++)
    	{
    		System.out.println(score[i][0]) ;
    	}*/
    	
    	for(int i = 1 ; i < size ; i ++)
    	{
    		List<Integer> temp = triangle.get(i);
    		for(int j = 1 ; j <= i ; j++)
    		{
    			score[i][j] = min(score[i-1][j-1],score[i-1][j == i ? j - 1 : j]) + 
    					temp.get(j);
    		}
    	}
    	/*for(int i = 0 ; i < size ; i ++)
    	{
    		for(int j = 0 ; j <= i ; j++)
    		{
    			System.out.print(score[i][j] + " ") ;
    		}
    		System.out.println();
    	}*/
    	int min = Integer.MAX_VALUE;
    	for(int i = 0 ; i < size ; i ++)
    	{
    		if(min > score[size - 1][i])
    		{
    			min = score[size - 1][i];
    		}
    	}
    	return min;
    	//return 0;
    }
	public static int minimumTotal(List<List<Integer>> triangle) {
    	// 这次从下到上考虑
		int len = triangle.size();
		int[][] dp = new int[len][len];
		// 设置边界值
		for (int j = 0 ; j <= len - 1 ; j++)
		{
			dp[len - 1][j] = triangle.get(len - 1).get(j);
		}
		// 状态转移方程
		for (int i = len-2 ; i >= 0 ; i--)
		{
			for (int j = 0 ; j <= i ; j++)
			{
				dp[i][j] = min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
			}
		}

		return dp[0][0];


	}

    public static int min(int a , int b)
    {
    	return a <= b ? a : b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> li0 = Arrays.asList(2);
		List<Integer> li1 = Arrays.asList(3,4);
		List<Integer> li2 = Arrays.asList(6,5,7);
		List<Integer> li3 = Arrays.asList(4,1,8,3);
		triangle.add(li0);
		triangle.add(li1);
		triangle.add(li2);
		triangle.add(li3);
		
		System.out.println(minimumTotal(triangle));
		
		
		
	}

}
