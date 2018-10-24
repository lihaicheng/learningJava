package nowcoder.exam.meituan1009;

import java.util.Scanner;

public class Main2 {
    public static void getRes(int n, int[] a) {
        int sum = 0;
        for (int temp : a)
        {
            sum += temp;
        }
        if (sum == 2 * (n - 1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; i++)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0 ; j < n ; j++)
            {
                a[j] = sc.nextInt();
            }
            getRes(n, a);

        }


    }
}
