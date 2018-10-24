package nowcoder.exam.ali0907;

import java.util.Scanner;

public class Main2 {
    public static int getResult(String[] strs)
    {
        int[] nums = new int[strs.length];
        for (int i = 0 ; i < strs.length ; i++)
        {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int count = 0;
        int max = -1;
        for (int j : nums)
        {
            if (max < j)
            {
                max = j;
            }
            if (j % 2 != 0)
            {
                count++;
            }
        }
        if (count % 2 != 0)
        {
            return 1;
        }
        else
        {
            return max;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n = n.replace('(',' ');
        n = n.replace(')',' ');
        n = n.trim();
        String[] strs = n.split(",");
        int res = getResult(strs);
        System.out.print(res);
    }
}
