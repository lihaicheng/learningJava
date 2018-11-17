package nowcoder.exam.wangyi2019xiaozho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        //int[] a = new int[n];
		int[] num = new int[n];
		Map<int[],Integer> nums = new HashMap<>();
        //a[0] = sc.nextInt();
		int a = sc.nextInt();
        //nums[0] = a[0];
        num[0] = a;
		int[] lowAndHigh = {0,a};
		nums.put(lowAndHigh, 1);
		
        for(int i = 1 ; i < n ; i++)
        {
        	//a[i] = sc.nextInt();
        	a = sc.nextInt();
        	num[i] = num[i-1] + a;
        	//int temp = num[i];
        	lowAndHigh = new int[]{0,num[i]};
        	nums.put(lowAndHigh, i+1);
        	
        }
        
        int m = sc.nextInt();
        //int[] q = new int[m];
        int q = 0;
        for(int i = 0 ; i < m ; i++)
        {
        	q = sc.nextInt();
        	for(int[] key : nums.keySet())
        	{
        		if(key[0] <= q && q <= key[1])
        		{
        			System.out.println(nums.get(key));
        			break;
        		}
        	}
        	/*for(int j = 0 ; j < n ; j++)
        	{
        		if(q <= nums[j])
        		{
        			System.out.println(j+1);
        			break;
        		}
        	}*/
        	
        }
        
        
	}

}
