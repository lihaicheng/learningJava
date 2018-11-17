package nowcoder.practice.xiaozhao2017_2;

import java.util.Scanner;

public class Main2 {
	public static int getNum(int x , int y)
	{
		int[][] map = new int[x+1][y+1];
		for(int i = 0 ; i <= y ; i++)
		{
			map[0][i] = 1;
		}
		for(int i = 0 ; i <= x ; i++)
		{
			map[i][0] = 1;
		}
		for(int i = 1 ; i <= x ; i++)
		{
			for(int j = 1 ; j <= y ; j++)
			{
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}
		return map[x][y];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //String[] strs = str.split(" ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(getNum(x,y));
        
	}

}
