package nowcoder.practice.offer2;

public class Solution10_4 {
	public int RectCover(int target) {
		int[] fib0or1 = {0,1};
		if(target < 2)
		{
			return fib0or1[target];
		}
		else
		{
			int temp1 = 1;
			int temp2 = 0;
			int fib = 0;
			for(int i = 2 ; i <= target ; i++)
			{
				fib = temp1 + temp2;
				temp2 = temp1;
				temp1 = fib;
			}
			return fib;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
