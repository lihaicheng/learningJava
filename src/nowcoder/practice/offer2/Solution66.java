package nowcoder.practice.offer2;

import java.util.Arrays;

public class Solution66 {
	public static int[] multiply(int[] A) {
		int len = A.length;
		int[] front = new int[len];
		int[] back = new int[len];
		int[] result = new int[len];
		int temp = 1;
		front[0] = 1;
		back[len - 1] = 1;
		for(int i = 1 ; i < len ; i++)
		{
			temp = temp * A[i - 1];
			front[i] = temp;
		}
		temp = 1;
		for(int i = len - 2 ; i >= 0 ; i--)
		{
			temp = temp * A[i + 1];
			back[i] = temp;
		}
		for(int i = 0 ; i < len ; i++)
		{
			result[i] = front[i] * back[i];
		}
		return result;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		System.out.println(Arrays.toString(multiply(A)));
	}

}
