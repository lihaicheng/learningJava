package nowcoder.practice.xiaozhao2017_2;

import java.util.Scanner;

public class Main4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //接收数据
		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			//处理数据
			String[] strs = str.split(" ");
			StringBuilder sb = new StringBuilder(strs[0]);
			for(int i = 1 ; i < strs.length ; i++)
			{
				sb.append(strs[i]);
			}
			if(sb.length() < 7)
			{
				System.out.println(sb);
			}
			else if(sb.length() < 15)
			{
				sb.insert(6, ' ');
				System.out.println(sb);
			}
			else
			{
				sb.insert(6, ' ');
				sb.insert(15, ' ');
				System.out.println(sb);
			}
			
		}
        
	}

}
