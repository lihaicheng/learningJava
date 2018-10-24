package nowcoder.exam.tencent0916;

import java.util.Scanner;

public class Main3 {
    public static void getRes(int a, int b, int c)
    {
        for (int i = 1 ; i < b ; i++)
        {
            if (a * i % b == c)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            getRes(a, b, c);
        }
    }
}
