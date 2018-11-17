package nowcoder.practice.xiaozhao2017_2;

import java.util.Scanner;

public class Main3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //接收数据
		int n = sc.nextInt();
		int[][] loc = new int[2][n];
		for(int i = 0 ; i < n ; i++)
		{
			loc[0][i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++)
		{
			loc[1][i] = sc.nextInt();
		}
		//找到最近的陷阱
		int index = 0;
		int min = loc[0][0] + loc[1][0];
		for(int i = 1 ; i < n ; i++)
		{
			if(loc[0][i] + loc[1][i] < min)
			{
				min = loc[0][i] + loc[1][i];
				index = i;
			}
		}
		//计算时间
		
        
        System.out.println(min -2);
        
	}

}
