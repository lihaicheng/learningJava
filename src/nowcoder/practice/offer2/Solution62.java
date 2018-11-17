package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution62 {
	public static int LastRemaining_Solution(int n, int m) {
		if(n == 0 || n == 1)
		{
			return n-1;
		}
		ArrayList<Integer> ai = new ArrayList<>();
		for(int i = 0 ; i < n ; i++)
		{
			ai.add(i);
		}
		int num = 0;
		int size = ai.size();
		while(size != 1)
		{
			num = (num + m - 1) % size;
			ai.remove(num);
			size--;
		}
		return ai.get(0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = 2;
		System.out.println(LastRemaining_Solution(n, m) );
	}

}
