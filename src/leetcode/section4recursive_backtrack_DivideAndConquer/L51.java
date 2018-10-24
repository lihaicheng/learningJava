package leetcode.section4recursive_backtrack_DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * 八皇后问题
 * 用到： ArrayList的深拷贝
 */
public class L51 {
    public static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    public static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static List<List<String>> solveNQueens(int n) {
        List<String> location = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        List<List<Integer>> mark = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            mark.add(new ArrayList<>());
            StringBuilder row = new StringBuilder();

            for(int j = 0 ; j < n ; j++)
            {
                mark.get(i).add(0);
                row.append(".");
            }
            location.add(row.toString());
        }
        //System.out.println(location);
        //System.out.println(mark);
        generate(0, n, location, result, mark);
        return result;


    }
    public static void put_down_the_queen(int x, int y, List<List<Integer>> mark)
    {
        mark.get(x).set(y, 1);
        for(int i = 1 ; i < mark.size() ; i++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                int new_x = x + i * dx[j];
                int new_y = y + i * dy[j];
                if(new_x >= 0 && new_x < mark.size() && new_y >= 0 && new_y < mark.size())
                {
                    mark.get(new_x).set(new_y, 1);
                }
            }
        }
    }
    public static void generate(int k, int n, List<String> location, List<List<String>> result, List<List<Integer>> mark) {
        //k == n 已经处理了0 ～ n-1行
        //System.out.println(k + "=======递归========");
        if(k == n)
        {
            //System.out.println("=======return=========");
            result.add(new ArrayList<>(location));
            return;
        }
        for(int i = 0 ; i < n ; i++)
        {
            if(mark.get(k).get(i) == 0)
            {
                //System.out.println("==================");
                //System.out.println(location);
                //System.out.println(mark);
                List<List<Integer>> temp_mark = new ArrayList<>();
                for(List<Integer> item : mark)
                {
                    temp_mark.add(new ArrayList<>(item));
                }

                StringBuilder loc = new StringBuilder(location.get(k));
                loc.replace(i, i+1, "Q");
                location.set(k, loc.toString());
                put_down_the_queen(k, i, temp_mark);
                //System.out.println("=======修改========");
                //System.out.println(location);
                //System.out.println(mark);

                generate(k+1, n, location, result, temp_mark);

                loc = new StringBuilder(location.get(k));
                loc.replace(i, i+1, ".");
                location.set(k, loc.toString());
                //System.out.println("=====回退========");
                //System.out.println(location);
                //System.out.println(mark);


            }
        }

    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> subset = solveNQueens(n);
        for(List i : subset)
        {
            System.out.print("test");
            System.out.print(i);
            System.out.println();
        }
    }

}
