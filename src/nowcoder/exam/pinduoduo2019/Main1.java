package nowcoder.exam.pinduoduo2019;

import java.util.Scanner;

public class Main1 {
	public static String[] names = {"Alice", "Bob", "Cathy", "Dave"};
	
	public static String getName(int n)
	{
		int num = 1;
		int index = 0;
		int power = 1;
		while(num < n)
		{
			
			for(int i = 0 ; i < power ; i++)
			{
				num++;
				/*if(num == n)
				{
					break;
				}*/
			}
			index ++;
			if(index == 3)
			{
				
				power = power * 2;
			}
			if(index == 4)
			{
				index = 0;
			}
		}
		/*if(index == -1)
		{
			index = 0;
		}*/
		return names[index];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alice", "Bob", "Cathy", "Dave"};
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(getName(n));

	}

}
