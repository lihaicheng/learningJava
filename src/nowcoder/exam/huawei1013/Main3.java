package nowcoder.exam.huawei1013;

import java.util.Scanner;

public class Main3 {
    public static void getRes(int n, int[] item)
    {
        int start = 0;
        int end = n - 1;
        int count = 0;
        while (start < end)
        {
            if (item[start] < item[end])
            {
                item[start+1] += item[start];
                start++;
                count++;
            }
            else if (item[start] > item[end])
            {
                item[end-1] += item[end];
                end--;
                count++;
            }
            else
            {
                start++;
                end--;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] item = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            item[i] = sc.nextInt();
        }
        getRes(n, item);

    }
}
