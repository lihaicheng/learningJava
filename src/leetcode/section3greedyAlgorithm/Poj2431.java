package leetcode.section3greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Poj2431 {
    public static int get_min_stop(int n, int[][] arr, int l, int p)
    {
        int result = 0;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <= o2[0])
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });
        /*for(int i = 0 ; i < n+1 ; i++)
        {
            System.out.println(arr[i][0]);
        }*/
        ArrayList<Integer> gas = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            // 剩下距离
            int dis = l - arr[i][0];
            // 中间可以加油，油箱不足以走到下一个城市，需要加油
            while(!gas.isEmpty() && p < dis)
            {
                p += gas.remove(0);
                result++;
            }
            // 中间不能加油，油箱不足以走到下一个城市，无法到达返回-1
            if(gas.isEmpty() && p < dis)
            {
                return -1;
            }
            //更新油箱余量
            //更新剩余距离
            p = p - dis;
            l = arr[i][0];
            //添加可以加油点
            gas.add(arr[i][1]);
            gas.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if(o1 <= o2)
                    {
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
                }
            });
            //System.out.print(gas);


        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][2];
        int i = 0;
        for(; i < n ; i++)
        {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        arr[i][0] = 0;
        arr[i][1] = 0;
        // 初始距离
        int l = sc.nextInt();
        // 汽油剩余量
        int p = sc.nextInt();

        int res = get_min_stop(n, arr, l, p);
        System.out.print(res);

    }
}
