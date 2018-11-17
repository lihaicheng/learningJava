package nowcoder.practice.offer2;

public class Solution20 {
	public static boolean isNumeric(char[] str) {
		int index = 0;
		//第一位不是+-和数字
		if(str.length <= 0 && str[index] != '+' && str[index] != '-' && (str[index] < '0' || str[index] > '9'))
		{
			return false;
		}
		//第一位是+-，第二位不是数字
		if(str[index] == '+' || str[index] == '-')
		{
			if (str[index+1] < '0' || str[index+1] > '9')
			{
				return false;
			}
		}
		
		for(int i = 0 ; i < str.length ; i ++)
		{
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'+','1'};
		System.out.println(isNumeric(str));
		//System.out.println((int)'1');

	}

}
