package nowcoder.practice.offer2;

public class Solution11 {
	public static int minNumberInRotateArray(int [] array) {
		if(array.length == 0)
		{
			return 0;
		}
		//int temp = array[0];
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		while(array[mid] >= array[mid-1])
		{
			if(array[mid] < array[0])
			{
				end = mid - 1;
				mid = (start + end)/2;
			}
			else if(array[mid] > array[0])
			{
				start = mid + 1;
				mid = (start + end)/2;
			}
		}
		return array[mid];
	    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,6,7,1,2};
		System.out.println(minNumberInRotateArray(arr));

	}

}
