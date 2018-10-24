package nowcoder.practice.offer.section2_4;

public class O13 {
//    public static int movingCount(int threshold, int rows, int cols)
//    {
//        if (threshold < 0 || rows < 0 || cols < 0)
//        {
//            return 0;
//        }
//        boolean[][] visited = new boolean[rows][cols];
//        return movingCountCore(threshold, rows, cols, 0, 0, visited);
//    }

//    public static int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[][] visited)
//    {
//        int count = 0;
//        if (canEnter(rows, cols, row, col, visited))
//        {
//            visited[row][col] = true;
//            count = 1
//                    + movingCountCore(threshold, rows, cols, row - 1, col, visited)
//                    + movingCountCore(threshold, rows, cols, row + 1, col, visited)
//                    + movingCountCore(threshold, rows, cols, row, col - 1, visited)
//                    + movingCountCore(threshold, rows, cols, row, col + 1, visited);
//
//        }
//        return count;
//    }
//    public static boolean canEnter(int threshold, int rows, int cols, int row, int col, boolean[][] visited)
//    {
//        int sum = 0;
//        for (int )
//        int sum = row % 10;
//        if (row >= 0 && row < rows
//                && col >= 0 && col < cols
//                && !visited[row][col] && threshold > )
//        {
//            return true;
//        }
//        return false;
//    }
    public static void main(String[] args)
    {
        int threshold = 18;
        int rows = 40;
        int cols = 50;
//        int res = movingCount(threshold, rows, cols);
//        System.out.print(res);

    }
}
