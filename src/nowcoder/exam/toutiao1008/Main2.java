package nowcoder.exam.toutiao1008;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static int getSum(int n, int m, ArrayList<Integer> arrx, ArrayList<Integer> arry)
    {
        int sizex = arrx.size();
        int sizey = arry.size();
        int[][] dp = new int[n][m];
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < m ; j++)
            {

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> arrx = new ArrayList<>();
        ArrayList<Integer> arry = new ArrayList<>();
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            arrx.add(a);
            int b = in.nextInt();
            arry.add(b);
        }

        int sum = getSum(n, m, arrx, arry);
        System.out.println(sum);

    }
}
