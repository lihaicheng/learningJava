package leetcode.VirtualGame;

public class T849 {
	public static int maxDistToClosest(int[] seats) {
		int maxLen = 0;
		int start = 0;
		int end = 0;
		boolean run = false;
		int seatsLen = seats.length;
		for(int i = 0 ; i < seatsLen ; i ++)
		{
			if(!run && seats[i] == 1)
			{
				start = i;
				maxLen = i;
				run = true;
				continue;
			}
			if(run && seats[i] == 1)
			{
				maxLen = maxLen < (i - start)/2 ? (i - start)/2 : maxLen;
				//System.out.println(maxLen);
				start = i;
			}
		}
		maxLen = maxLen < (seatsLen - 1 - start) ? (seatsLen - 1 - start) : maxLen;
		//System.out.println(maxLen);
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats = {1,0,0,0,1,0,1}; 
		System.out.println(maxDistToClosest(seats));

	}

}
