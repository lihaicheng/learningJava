package nowcoder.exam.huawei1013;

import java.util.Scanner;

public class Main2 {
    public static void getRes(int[][] item)
    {
        boolean[][] flag = new boolean[10][10];
        int max = 0;
        for (int i = 0 ; i < 10 ; i++)
        {
            for (int j = 0 ; j < 10 ; j++)
            {
                if (!flag[i][j] && item[i][j] == 1)
                {
                    max = Math.max(max,resCore(item, flag, i, j) );
                }
            }
        }
        System.out.println(max);
    }

    public static int resCore(int[][] item, boolean[][] flag, int row, int col)
    {
        int size = 0;
        if (row >= 0 && row < 10 && col >= 0 && col < 10
                && item[row][col] == 1 && !flag[row][col])
        {
            flag[row][col] = true;
            size = 1 + resCore(item, flag, row-1, col)
                    + resCore(item, flag, row+1, col)
                    + resCore(item, flag, row, col-1)
                    + resCore(item, flag, row, col+1);
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] item = new int[10][10];
        for (int i = 0 ; i < 10 ; i++)
        {
            for (int j = 0 ; j < 10 ; j++)
            {
                item[i][j] = sc.nextInt();
            }
        }
        getRes(item);

    }
}
