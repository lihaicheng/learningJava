package leetcode.medium;

public class L318
{
    public static int maxProduct(String[] words) {
        boolean[][] re = new boolean[words.length][words.length];
        for(int x = 0 ; x < words.length ; x++)
        {
            for(int y = 0 ; y < words.length ; y++)
            {
                re[x][y] = true;
            }
        }
        for(int i = 0 ; i < words.length ; i++)
        {
            char[] chars = words[i].toCharArray();
            for(int j = 0 ; j < chars.length ; j++)
            {
                for(int k = i ; k < words.length ; k++)
                {
                    int index = words[k].lastIndexOf(chars[j]);
                    if(index > j)
                    {
                        re[i][k] = false;
                    }
                }
            }
        }
        int value = Integer.MAX_VALUE;
        for(int x = 0 ; x < words.length ; x++)
        {
            for(int y = x + 1 ; y < words.length ; y++)
            {
                int newValue = words[x].length() * words[y].length();
                if(re[x][x] == true && re[y][y] == true &&re[x][y] == true && (newValue < value))
                {
                    value = newValue;
                }
            }
        }
        return (value == Integer.MAX_VALUE) ? 0 : value;
    }

    public static void main(String[] args)
    {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        int re = maxProduct(words);
        System.out.println(re);
    }
}
