package nowcoder.practice.offer2;


public class Solution42 {
	public static int FindGreatestSumOfSubArray(int[] array) {
		int i = 0;
		int maxFushu = Integer.MIN_VALUE;
		boolean quanweifushu = true;
		int max1 = 0;
		int max2 = 0;
		for(; i < array.length ;)
		{
			if(array[i] > 0)
			{
				quanweifushu = false;
				break;
			}
			if(array[i] > maxFushu)
			{
				maxFushu = array[i];
			} 
			i++;
		}
		if(quanweifushu)
		{
			return maxFushu;
		}
		else
		{
			for(int j = i ; j < array.length ; j++)
			{
				int k = j;
				System.out.println("========array[k]");
				System.out.println(array[k]);
				
				max2 = max2 + array[k];
				System.out.println("========max2");
				System.out.println(max2);
				System.out.println("========max1");
				
				if(max2 < 0)
				{
					while(array[k] < 0)
					{
						max2 = max2 - array[k];
						k--;
					}
					if(max2 > max1)
					{
						max1 = max2;
						
					}
					max2 = 0;
					
				}
				else
				{
					if(max2 > max1)
					{
						max1 = max2;
					}
				}
				
				
				System.out.println(max1);
				System.out.println("========");
			}
			return max1;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1,-2,3,10,-4,7,2,-5 };
		System.out.println(FindGreatestSumOfSubArray(array));

	}

}
