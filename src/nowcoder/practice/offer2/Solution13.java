package nowcoder.practice.offer2;

public class Solution13 {
	public static int movingCount(int threshold, int rows, int cols)
    {
		int count = 0;
		//下边两个值为行列位数之和
		int sumR = 0;
		int sumC = 0;
		for(int r = 0 ; r < rows ; r ++)
		{
			//下边的值表示r剩下的位数
			int indexR = r;
			sumR = 0;
			while(indexR != 0)
			{
				sumR = sumR + indexR % 10;
				indexR /= 10;
			}
			for(int c = 0 ; c < cols ; c ++)
			{
				//下边的值表示c剩下的位数
				int indexC = c;
				while(indexC != 0)
				{
					sumC = sumC + indexC % 10;
					indexC /= 10;
				}
				if(sumR + sumC <= threshold)
				{
					System.out.println("r sumR :" + r + " " +sumR);
					System.out.println("c sumC :" + c + " " +sumC);
					count++;
					sumC = 0;
				}
				else
				{
					sumC = 0;
				}
			}
			
				
			
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int threshold = 10;
		int rows = 1;
		int cols = 100;
		System.out.println(movingCount( threshold,  rows, cols));
	}

}
