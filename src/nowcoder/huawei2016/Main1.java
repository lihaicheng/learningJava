package nowcoder.huawei2016;

import java.util.Scanner;

public class Main1 {
    public static int getResultQ(int[] scores, int start, int end)
    {
        int max = -99;
        for (int i = start - 1 ; i < end ; i++)
        {
            if (scores[i] > max)
            {
                max = scores[i];
            }
        }
        return max;
    }
    public static void getResultU(int[] scores, int index, int score)
    {
        scores[index - 1] = score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] scores = new int[n];
        String[] scorestr = sc.nextLine().split(" ");
        for (int i = 0 ; i < n ; i++)
        {
            scores[i] = Integer.parseInt(scorestr[i]);
        }
        for (int i = 0 ; i < m ; i++)
        {
            String cmd = sc.nextLine();
            String[] cmds = cmd.split(" ");
            if (cmds[0].equals("Q"))
            {
                int start = Integer.parseInt(cmds[1]);
                int end = Integer.parseInt(cmds[2]);
                if (start > end)
                {
                    int temp = start;
                    start = end;
                    end = temp;
                }
                int res = getResultQ(scores, start, end);
                System.out.println(res);
            }
            if (cmds[0].equals("U"))
            {
                int index = Integer.parseInt(cmds[1]);
                int score = Integer.parseInt(cmds[2]);
                getResultU(scores, index, score);
            }

        }

    }
}
