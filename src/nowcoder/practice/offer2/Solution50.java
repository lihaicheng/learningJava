package nowcoder.practice.offer2;

import java.util.Arrays;

public class Solution50 {
	public static int FirstNotRepeatingChar(String str) {
		char[] chars1 = str.toCharArray();
		char[] chars2 = str.toCharArray();
		Arrays.sort(chars2);
		System.out.println(chars2);
		//for(int i = 0 ; )
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "acab";
		FirstNotRepeatingChar(str);

	}

}
