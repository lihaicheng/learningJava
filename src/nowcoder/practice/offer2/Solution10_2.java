package nowcoder.practice.offer2;

public class Solution10_2 {
	public int JumpFloor(int target) {
		int[] Jump0or1 = {0,1,2};
		if(target < 3)
		{
			return Jump0or1[target];
		}
		else
		{
			int temp1 = 2;
			int temp2 = 1;
			int fib = 0;
			for(int i = 3 ; i <= target ; i++)
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
