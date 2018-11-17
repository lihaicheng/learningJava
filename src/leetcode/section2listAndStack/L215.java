package leetcode.section2listAndStack;

public class L215 {

	public static int findKthLargest(int[] nums, int k) {
		int index = nums.length - k;//第k大的数字的下标应当在nums.length - k的位置上
		int s = 0;
		int e = nums.length - 1;
		int loc = quicksort(nums,s,e);
		while(loc != index)
		{
			if(loc < index)
			{
				s = loc + 1;
				loc = quicksort(nums,s,e);
			}
			else
			{
				e = loc - 1;
				loc = quicksort(nums,s,e);
			}
		}
		return nums[index];

	}

	public static int quicksort(int[] nums, int s , int e) {
		int start = s;
		int end = e;
		int temp = nums[start];
		
		while(start != end)
		{
			System.out.println(start + " " + end + " " + temp);
			while(start < end && nums[end] > temp)
			{
				end--;
			}
			if(start < end)
			{
				nums[start] = nums[end];
				start++;
			}
			
			while(start < end && nums[start] < temp)
			{
				start++;
			}
			if(start < end)
			{
				nums[end] = nums[start];
				end--;
			}
			
		}
		nums[start] = temp;
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 9;
		System.out.println(findKthLargest(nums, k));

	}

}
