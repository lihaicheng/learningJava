package nowcoder.exam.didi1010;

import java.util.Scanner;

public class Main2 {
    public static int getResult(int n, int x, int[] a)
    {
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//arr.size
        int x = sc.nextInt();//券值
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int res = getResult(n, x, a);
        //System.out.println(res);

    }
}
