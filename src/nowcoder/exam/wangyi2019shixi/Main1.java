package nowcoder.exam.wangyi2019shixi;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        if(str.equals(""))
        {
        	return;
        }
        //System.out.println(str + " " );
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        if(n == 0 || m == 0)
        {
        	return;
        }
        int[][] dipi = new int[n][2];
        for(int i = 0 ; i < n ; i++)
        {
        	str = sc.nextLine();
            strs = str.split(" ");
            dipi[i][0] = Integer.parseInt(strs[0]);
            dipi[i][1] = Integer.parseInt(strs[1]);
        }
        int[] ai = new int[m];
        str = sc.nextLine();
        strs = str.split(" ");
        for(int i = 0 ; i < n ; i++)
        {
            ai[i] = Integer.parseInt(strs[i]);
        }
        //从用例中可以看出薪资是排序的，如果没有排序，这里要加个排序
        for(int i = 0 ; i < m ; i++)
        {
        	for(int j = n-1 ; j >= 0 ; j--)
            {
            	if(ai[i] >= dipi[j][0])
            	{
            		System.out.println(dipi[j][1]);
            		break;
            	}
            }
        }
        
	}

}
