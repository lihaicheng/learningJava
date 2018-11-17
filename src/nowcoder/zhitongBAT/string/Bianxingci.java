package nowcoder.zhitongBAT.string;

import java.util.HashMap;
import java.util.Map;

public class Bianxingci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123";
		char[] c1 = str1.toCharArray();
		String str2 = "231";
		char[] c2 = str2.toCharArray();
		Map<Character,Integer> mapStr1 = new HashMap<Character,Integer>();
		Map<Character,Integer> mapStr2 = new HashMap<Character,Integer>();
		for(int i = 0 ; i < c1.length ; i ++)
		{
			int num = mapStr1.containsKey(c1[i]) ? mapStr1.remove(c1[i]) : 0;
			mapStr1.put(c1[i], num+1);
		}
		for(int i = 0 ; i < c2.length ; i ++)
		{
			int num = mapStr2.containsKey(c2[i]) ? mapStr2.remove(c2[i]) : 0;
			mapStr2.put(c2[i], num+1);
		}
		System.out.println(mapStr1.equals(mapStr2));

	}

}
