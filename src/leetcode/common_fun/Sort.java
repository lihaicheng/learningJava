package leetcode.common_fun;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        int[][] arr = {
                {8,7},{9,5},{6,4}
        };

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
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
