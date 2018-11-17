package nowcoder.exam.tencent0916;

import java.util.Scanner;

public class Main1 {

    public static int gcd(int a, int b)
    {
        int tmp1 = 0;
        int n1 = a;
        int n2 = b;
        if (a < b)
        {
            n1 = b;
            n2 = a;
        }
        if (n1 % n2 == 0)
        {
            return n2;
        }
        while (n1 % n2 > 0)
        {
            tmp1 = n1 % n2;
            if (tmp1 < n2)
            {
                n1 = n2;
                n2 = tmp1;
            }
            if (n1 % n2 == 0)
            {
                return n2;
            }
        }
        return 1;
    }
    public static int lcm(int a, int b)
    {
        return a * b / gcd(a, b);
    }

    public static int getM(int n)
    {
        int lcm_n = 1;
        int m = n+1;
        for (int i = 1 ; i <= m ; i++)
        {
            lcm_n = lcm(lcm_n, i);
        }
        int lcm_m = m;
        while (lcm_n != lcm_m)
        {
            m++;
            lcm_n = lcm(lcm_n, m);
            lcm_m = lcm(lcm_m, m);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = getM(n);
        System.out.println(m);

    }
}
