package nowcoder.exam.tusimple0921;

public class Main
{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {34, 220, 23, 654, 232, 456};
        int x = 234;
        int res = query(a, 0, x);
        System.out.println(res);
	}
    public static int query(int[] a, int n, int x){
	    int sum = a[0];
        int min_sum = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        while(r < a.length - 1)
        {
            r++;
            sum = sum + a[r];
            if (sum >= x)
            {
                if (sum < min_sum)
                {
                    min_sum = sum;
                }
                sum -= a[l];
                l++;
            }
        }
        return min_sum;
    }

}

