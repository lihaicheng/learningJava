package nowcoder.practice.offer2;

public class Solution15 {

	public static int NumberOf1(int n) {
		/*if(n <= 0)
		{
			return 0;
		}
		int sum1 = 0;
		while(n != 1)
		{
			sum1 = sum1 + n % 2;
			n /= 2;
		}
		sum1 ++;
		return sum1;*/
		int count = 0;
		while(n != 0)
		{
			count++;
			n = (n-1)&n;
			System.out.println(Integer.toBinaryString(n));
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(Integer.toBinaryString(n));
		//System.out.println(NumberOf1(n));
		/*int i = 0b1000;
		System.out.println(i);*/
	}

}
