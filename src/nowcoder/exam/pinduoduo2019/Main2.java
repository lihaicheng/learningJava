package nowcoder.exam.pinduoduo2019;

import java.util.Scanner;

public class Main2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strs = str.split(" ");
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		String[] notes = new String[m];
		int[] nums = new int[m];
		for(int i = 0 ; i < m ; i++)
		{
			char[] chars = in.nextLine().toCharArray();
			char temp = chars[0];
			for(int j = 1 ; j < n ; j++)
			{
				if(chars[j] < temp)
				{
					temp = chars[j];
					nums[i] = j;
				}
			}
			
		}
		
		for(int i = 0 ; i < m ; i++)
		{
			
			System.out.println(nums[i]);
		}
		
		

	}

}
