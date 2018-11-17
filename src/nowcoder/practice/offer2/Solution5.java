package nowcoder.practice.offer2;

public class Solution5 {

	public static String replaceSpace1(StringBuffer str) {
		int index;
		while((index = str.indexOf(" ")) != -1)
		{
			str = str.replace(index, index + 1, "%20");
		}
		String result = str.toString();
		return result;
	}
	public static String replaceSpace2(StringBuffer str) {
		/*int index;
		while((index = str.indexOf(" ")) != -1)
		{
			str = str.replace(index, index + 1, "%20");
		}*/
		StringBuffer tempResult = new StringBuffer();
		int start = 0;
		int end;
		int i;
		for(i = 0 ; i < str.length() ; i ++)
		{
			if(str.charAt(i) == ' ')
			{
				end = i ;
				tempResult.append(str.substring(start, end)).append("%20");
				start = end + 1;
			}
		}
		end = i ;
		tempResult.append(str.substring(start, end));
		String result = tempResult.toString();
		return result;
	}
	/*public static String replaceSpace(StringBuffer str) {
		char[] chs = str.toString().toCharArray();
		int num = 0;
		for(int i = 0 ; i < chs.length ; i++)
		{
			if(chs[i] == ' ')
			{
				num++;
			}
		}
		char[] chs2 = new char[chs.length + num * 2];
		int i2 = 0;
		for(int i = 0 ; i < chs.length ; i++)
		{
			if(chs[i] == ' ')
			{
				chs2[i2++] = '%';
				chs2[i2++] = '2';
				chs2[i2++] = '0';
			}
			else
			{
				chs2[i2++] = chs[i];
			}
		}
			
			
		String result = String.valueOf(chs2);
		return result;
	}*/
	public static String replaceSpace(StringBuffer str) {
		char[] chars = str.toString().toCharArray();
		int numOfSpace = 0;
		for(int i = 0 ; i < chars.length ; i ++)
		{
			if(chars[i] == ' ')
			{
				numOfSpace++;
			}
		}
		char[] newChars = new char[chars.length + numOfSpace * 2];
		
		for(int i = chars.length-1, j = chars.length + numOfSpace * 2 - 1;i >= 0 && j >=0;)
		{
			if(chars[i] == ' ')
			{
				newChars[j--] = '0';
				newChars[j--] = '2';
				newChars[j--] = '%';
				i--;
			}
			else
			{
				newChars[j--] = chars[i--];
			}
		}
		
		return new String(newChars);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("hello word");
		String result = replaceSpace(str);
		
		System.out.println(result);

	}

}
