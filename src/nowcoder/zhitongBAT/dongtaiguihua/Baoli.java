package nowcoder.zhitongBAT.dongtaiguihua;

public class Baoli {

	public static int p1(int[] arr , int index , int aim)
	{
		if(index == arr.length - 1)
		{
			return 1;
		}
		int res = 0;
		for(int i = 0 ; i * arr[index] <= aim ; i++)
		{
			int lost = aim - i * arr[index];
			res += p1(arr , index + 1 , lost);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1};//{5,10,25,1};
		int index = 0;
		int aim = 10;
		System.out.println(p1(arr,index,aim));

	}

}
