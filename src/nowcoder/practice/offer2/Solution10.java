package nowcoder.practice.offer2;

public class Solution10 {
	/*public static int Fibonacci(int n) {
		int[] fib0or1 = {0,1};
		if(n < 2)
		{
			return fib0or1[n];
		}
		else
		{
			int temp1 = 1;
			int temp2 = 0;
			int fib = 0;
			for(int i = 2 ; i <= n ; i++)
			{
				fib = temp1 + temp2;
				temp2 = temp1;
				temp1 = fib;
			}
			return fib;
		}
		
    }*/
	public static int Fibonacci(int n) {
		int temp = 0;
		int temp1 = 1;
		int temp2 = 1;
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return temp1;
		}
		if(n == 2)
		{
			return temp2;
		}
		for(int i = 3 ; i <= n ; i++)
		{
			temp = temp2;
			temp2 = temp1 + temp2;
			temp1 = temp;
		}
		return temp2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		System.out.println("Fibonacci(100):" + Fibonacci(3));
		long endTime=System.currentTimeMillis(); //获取结束时间
		 
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}

}
