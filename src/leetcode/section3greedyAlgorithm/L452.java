package leetcode.section3greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class L452 {
    public static int findMinArrowShots(int[][] points) {
        if(points.length == 0)
        {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <= o2[0])
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        });
        int num = 1;
        int shut_left = points[0][0];
        int shut_right = points[0][1];
        for(int i = 1 ; i < points.length ; i++)
        {
            if(points[i][0] <= shut_right)
            {
                shut_left = points[i][0];
                if(points[i][1] <= shut_right)
                {
                    shut_right = points[i][1];
                }
            }
            else
            {
                num++;
                shut_left = points[i][0];
                shut_right = points[i][1];
            }
        }
        return num;

    }

    public static void main(String[] args) {
        int[][] points = {
                {10,16}, {2,8}, {1,6}, {7,12}
        };
        int num = findMinArrowShots(points);
        System.out.print(num);
    }
}
