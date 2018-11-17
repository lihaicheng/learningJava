package nowcoder.practice.offer2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution40 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> ai = new ArrayList<>();
		if(input.length < k)
		{
			return ai;
		}
		int start  = 0;
		int end = input.length - 1;
		Arrays.sort(input);
		for(int i = 0 ; i < k ; i++)
		{
			ai.add(input[i]);
		}
		return ai;

	}

	public static void QuickSort(int[] input , int start , int end) {
		int s = start;
		int e = end;
		int temp = input[start];
		while(start != end)
		{
			while(input[e] >= temp)
			{
				e--;
			}
			input[s] = input[e];
			s++;
			while(input[s] < input[e])
			{
				s++;
			}
			input[e] = input[s];
		}
		input[s] = temp;
		if(start != s)
		{
			QuickSort(input , start , s);
		}
		if(e != end)
		{
			QuickSort(input , e , end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 5, 1, 6, 2, 7, 3, 8 };
		System.out.println(GetLeastNumbers_Solution(array, 4));

	}

}
