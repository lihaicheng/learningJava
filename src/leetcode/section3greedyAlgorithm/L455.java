package leetcode.section3greedyAlgorithm;

import java.util.Arrays;

public class L455
{
    public static int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length)
        {
            if(g[i] <= s[j])
            {
                i++;
                j++;
                res++;
            }
            else
            {
                j++;
            }
        }

        return res;
    }
    public static void main(String[] args)
    {
        int[] g = {3,1,2,3};
        int[] s = {1,1};
        int num = findContentChildren(g,s);
        System.out.println(num);
    }
}
