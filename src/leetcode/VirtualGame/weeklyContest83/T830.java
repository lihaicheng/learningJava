package leetcode.VirtualGame.weeklyContest83;

import java.util.ArrayList;
import java.util.List;

public class T830 {
    public static List<List<Integer>> largeGroupPositions(String S) {
        char[] chars = S.toCharArray();
        List<Integer> ai = new ArrayList<>();
        List<List<Integer>> aai = new ArrayList<>();
        char c = chars[0];
        int num = 1;
        ai.add(0);
        int i = 1;
        for ( ; i < chars.length ; i++)
        {
            if (chars[i] == c)
            {
                num++;
            }
            else
            {
                if (num >= 3)
                {
                    ai.add(i-1);
                    aai.add(ai);
                    ai = new ArrayList<Integer>();
                    ai.add(i);
                    num = 1;
                }
                else
                {
                    ai.clear();
                    ai.add(i);
                    num = 1;
                }
                c = chars[i];
            }
        }
        if (num >= 3)
        {
            ai.add(i-1);
            aai.add(ai);
            ai = new ArrayList<Integer>();
            ai.add(i);
        }
        return aai;
    }

    public static void main(String[] args) {
        String S = "abcdddeeeeaabbbcd";
        List<List<Integer>> lli = largeGroupPositions(S);
        /*for (List<Integer> list : lli)
        {
            for (Integer integer : list)
            {
                System.out.println(integer);
            }
        }*/
        /*Iterator it1 = lli.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
        }*/
        System.out.println(lli);
    }
}
