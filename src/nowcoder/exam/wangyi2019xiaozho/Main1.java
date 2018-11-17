package nowcoder.exam.wangyi2019xiaozho;

import java.util.ArrayList;
import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int highest = 0;
        int lowest = 10001;
        for(int i = 0 ; i < n ; i++)
        {
        	a[i] = sc.nextInt();
        	highest = highest < a[i] ? a[i] : highest;
        	lowest = lowest < a[i] ? lowest :a[i];
        }
        //桶排序
        ArrayList<ArrayList<Integer>> aai = new ArrayList<>();
        for(int num = lowest ; num <= highest ; num++)
        {
        	ArrayList<Integer> ai = new ArrayList<>();
        	for(int i = 0 ; i < n ; i++)
        	{
        		if(a[i] == num)
        		{
        			ai.add(i);
        		}
        	}
        	aai.add(ai);
        }
        int[][] xy = new int[k][2];
        int m = 0;
        //移动
        for(; m < k ; m++)
        {
        	if(aai.size() > 2)
        	{
        		int high = aai.get(aai.size()-1).remove(0);
        		aai.get(aai.size()-2).add(high);
        		xy[m][0] = high+1;
        		int low = aai.get(0).remove(0);
        		aai.get(1).add(low);
        		xy[m][1] = low+1;
        		
            	if(aai.get(aai.size()-1).isEmpty())
            	{
            		aai.remove(aai.size()-1);
            	}
            	if(aai.get(0).isEmpty())
            	{
            		aai.remove(0);
            	}
        	}
        	else
        	{
        		break;
        	}
        	
        }
        //不稳定值就是aai的size-1
        int s = aai.size()-1;
        System.out.println(s + " " + m);
        for(int i = 0 ; i < m ; i ++)
        {
        	System.out.println(xy[i][0] + " " + xy[i][1]);
        }
        
        
	}

}
