package nowcoder.practice.offer2;


public class Solution43 {
	public static int NumberOf1Between1AndN_Solution(int n) {
		if(n == 0)
		{
			return 0;
		}
		if(n < 10)
		{
			return 1;
		}
		int num = 1;
		for(int i = 10 ; i <= n ; i++)
		{
			int k = i;
			while(k != 0)
			{
				if(k % 10 == 1)
				{
					num++;
					k = k / 10;
				}
				else
				{
					k = k / 10;
				}
				
			}
		}
		
		return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		System.out.println(NumberOf1Between1AndN_Solution(n));

	}

}
