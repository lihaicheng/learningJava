package nowcoder.exam.toutiao1008;

import java.util.Scanner;

public class Main1 {

    public static int getNum(int a, int b, int k)
    {
        int min = (int)Math.pow(10, k-1);
        int max = (int)Math.pow(10, k) - 1;
        int num = 0;
        int temp = 0;
        int sum = 0;
        int n = 0;
        boolean bre = false;
        for (int i = min ; i <= max ; i++)
        {
            temp = i;
            sum = 0;
            bre = false;
            while (temp != 0)
            {
                n = temp % 10;
                if (n != a && n != b)
                {
                    bre = true;
                    break;
                }
                sum += n;
                temp = temp / 10;
            }
            if (bre || (sum != a &&  sum != b))
            {
                continue;
            }
            num++;

        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int num = getNum(a, b, k);
        System.out.println(num);

    }
}
