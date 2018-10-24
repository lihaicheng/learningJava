package nowcoder.practice.offer2;

public class Solution16 {
	public static double Power(double base, int exponent) {
		if(exponent == 0)
		{
			return 1.0;
		}
		else if(exponent > 0)
		{
			double power = 1;
			for(int i = 0 ; i < exponent ; i++)
			{
				power *= base;
			}
			return power;
		}
		else if(exponent < 0)
		{
			double power = 1;
			int absExponent = -exponent;
			for(int i = 0 ; i < absExponent ; i++)
			{
				power *= base;
			}
			return 1/power;
		}
		
		return exponent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = 2.3;
		int exponent = 0;
		System.out.println(Power(base, exponent));
	}

}
