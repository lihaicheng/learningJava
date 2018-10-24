package nowcoder.exam.pinduoduo2019;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strs = str.split(" ");
		int n = Integer.parseInt(strs[0]);
		int k = Integer.parseInt(strs[1]);
		str = in.nextLine();
		char[] chars = str.toCharArray();
		
		
		
		
		int len = strs.length;
		int[] w = new int[len];
		boolean[] b = new boolean[len];
		for(int i = 0 ; i < len ; i++)
		{
			w[i] = Integer.parseInt(strs[i]);
		}
    	Arrays.sort(w);
    	/*for(int i = 0 ; i < len ; i++)
		{
			System.out.println(w[i]);
		}*/
    	int count = 0;
    	int weight = 300;
    	for(int i = len - 1 ; i >= 0 ; i--)
    	{
    		if(b[i])
    		{
    			continue;
    		}
    		count++;
    		weight -= w[i];
    		for(int j = i-1 ; j >= 0 ; j--)
    		{
    			if(!b[j] && w[j] <= weight)
    			{
    				b[j] = true;
    				weight -= w[j];
    			}
    		}
    		weight = 300;
    		
    	}
    	System.out.println(count);
    	

	}

}
