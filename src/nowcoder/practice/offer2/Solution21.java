package nowcoder.practice.offer2;

public class Solution21 {

	public static void reOrderArray(int [] array) {
		//int [] array1 = new int[array.length];
		int array1Length = 0;
		int [] array2 = new int[array.length];
		int array2Length = 0;
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i] % 2 == 1)
			{
				array[array1Length++] = array[i];
			}
			else if(array[i] % 2 == 0)
			{
				array2[array2Length++] = array[i];
			}
		}
		for(int i = 0 ;i < array2Length ; i++)
		{
			array[array1Length++] = array2[i];
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3};
		reOrderArray(array);
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
