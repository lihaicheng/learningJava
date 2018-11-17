package nowcoder.exam.toutiao1008;

import java.util.HashMap;
import java.util.Scanner;

public class Main5 {

    public static int getRes(int m,int a,int b,HashMap<Integer,Integer> bre)
    {
        if (m == 0)
        {
            return 1;
        }
        int sum = 0;
        for (int i = 1 ; i <= m ; i++)
        {
            for (int j = 0 ; j < b-a ; j++)
            {
                if (bre.containsKey(m-b+i))
                {
                    sum = getRes(m-b+i, a, b, bre);
                }

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        // int[] bre = new int[n];
        HashMap<Integer,Integer> bre = new HashMap<>();
        for (int i = 0 ; i < n ; i++)
        {
            bre.put(in.nextInt(),1);
        }
        getRes(m, a, b, bre);

    }
}
