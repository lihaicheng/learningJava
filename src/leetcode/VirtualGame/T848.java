package leetcode.VirtualGame;

public class T848 {
	static char[] ps = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "mkgfzkkuxownxvfvxasy";
		int[]  shifts = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
		System.out.println(S);
		System.out.println(shiftingLetters(S,shifts));
	}

	public static String shiftingLetters(String S, int[] shifts) {
		char[] c = S.toCharArray();
		int temp;
		for(int i = 0 ; i < shifts.length ; i++)
		{
			temp = shifts[i] % 26;
			for(int j = 0 ; j <= i ; j++)
			{
				c[j] = (char) (c[j] + temp);
				while(c[j] > 'z')
				{
					c[j] -= 26;
				}
			}
			
			
		}
		String result = new String(c);
		return result;
	}
}
