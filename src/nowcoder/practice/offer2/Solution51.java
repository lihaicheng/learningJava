package nowcoder.practice.offer2;

public class Solution51 {
	public static int InversePairs(int[] array) {
		int p = 0;
		for(int i = 0 ; i < array.length ; i++)
		{
			for(int j = i + 1 ; j < array.length ; j ++)
			{
				if(array[i] > array[j])
				{
					p++;
				}
			}
		}
		
		return p % 1000000007;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(array));

	}

}
