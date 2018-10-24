package nowcoder.practice.offer2;


public class Solution49 {
	public static int GetUglyNumber_Solution(int index) {
		if(index == 1)
		{
			return 1;
		}
		boolean added = false;
		int uglyNumber = 1;
		for(int i = 1 ; i < index ; i++)
		{
			uglyNumber++;
			while(!isUgly(uglyNumber))
			{
				uglyNumber++;
			}
			
		}
        return uglyNumber;
    }
	public static boolean isUgly(int uglyNumber) {
		if(uglyNumber == 2 || uglyNumber == 3 || uglyNumber == 5)
		{
			return false;
		}
		int un = uglyNumber;
		while(un % 2 == 0)
		{
			un = un / 2 ;
		}
		while(un % 3 == 0)
		{
			un = un / 3 ;
		}
		while(un % 5 == 0)
		{
			un = un / 5 ;
		}
		
		if(un != 1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 4;
		System.out.println(GetUglyNumber_Solution(index));

	}

}
