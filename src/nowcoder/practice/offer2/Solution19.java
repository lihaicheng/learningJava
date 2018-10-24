package nowcoder.practice.offer2;

public class Solution19 {
	public boolean match(char[] str, char[] pattern)
    {
		int j = 0;//用j表示str的下标
		for(int i = 0 ; i < pattern.length ;)
		{
			if(pattern[i] == '.')
			{
				i++;
				j++;
			}
			else if(pattern[i] == '*')
			{
				
			}
			else
			{
				if(pattern[i] == str[j])
				{
					i++;
					j++;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'a','a','a'};
		char[] pattern = {'a','.','a'};

	}

}
