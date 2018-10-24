package nowcoder.exam.iqiyi0915;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static int getResult(int[] ints)
    {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0 ; i < 3 ; i++)
        {
            sum1 += ints[i];
            sum2 += ints[i+3];
        }
        if (sum1 == sum2)
        {
            return 0;
        }
        int def = 0;
        if (sum1 < sum2)
        {
            def = sum2 - sum1;
            for (int i = 0 ; i < 3 ; i++)
            {
                ints[i] = 9 - ints[i];
            }
        }
        else
        {
            def = sum1 - sum2;
            for (int i = 3 ; i < 6 ; i++)
            {
                ints[i] = 9 - ints[i];
            }
        }
        Arrays.sort(ints);
        int res = 0;
        for (int i = 5 ; i >= 0 && def > 0 ; i--)
        {
            //System.out.println(def);
            //System.out.println(ints[i]);
            def -= ints[i];
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int[] ints = new int[6];
        for (int i = 0 ; i < 6 ; i++)
        {
            ints[i] = chars[i] - '0';
        }
        int res = getResult(ints);
        System.out.println(res);

    }
}
