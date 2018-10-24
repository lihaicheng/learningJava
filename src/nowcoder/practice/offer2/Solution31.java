package nowcoder.practice.offer2;
import java.util.ArrayList;

public class Solution31 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		
		ArrayList al = new ArrayList();
		int i = 0,j = 0,k = -1;
		//i是pop的下标，j是push的下标，k是ArrayList的下标
		while(i != popA.length)
		{
			if(j == pushA.length)
			{
				return false;
			}
			al.add(pushA[j]);
			j++;
			k++;
			
			while((int)al.get(k) == popA[i])
			{
				al.remove(k);
				k--;
				i++;
				if(k < 0)
				{
					break;
				}
				
			}
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pushA = {1};
		int [] popA = {2};
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		
		System.out.println(IsPopOrder(pushA,popA));
	}

}
