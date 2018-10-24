package nowcoder.practice.offer.section2_4;

public class O12 {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int nums = rows * cols;
        if (nums == 0)
        {
            return false;
        }
        boolean[] flag = new boolean[nums];
        for (int i = 0 ; i < nums ; i++)
        {
            int index = 0;
            if (hasPathCore(matrix, rows, cols, str, flag, i, index))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean hasPathCore(char[] matrix, int rows, int cols, char[] str, boolean[] flag, int i, int index)
    {
        if (matrix[i] == str[index])
        {
            if (index == str.length - 1)
            {
                return true;
            }
            flag[i] = true;
            if (i - 1 >= (i / cols) * cols && !flag[i - 1])
            {
                if (hasPathCore(matrix, rows, cols, str, flag, i - 1, index+1))
                {
                    return true;
                }
            }
            if (((i + 1) < (i / cols + 1) * cols) && !flag[i+1])
            {
                if (hasPathCore(matrix, rows, cols, str, flag, i + 1, index+1))
                {
                    return true;
                }
            }
            if (i / cols > 0 && !flag[i-cols])
            {
                if (hasPathCore(matrix, rows, cols, str, flag, i-cols, index+1))
                {
                    return true;
                }
            }
            if (i / cols < rows -1 && !flag[i+cols])
            {
                if (hasPathCore(matrix, rows, cols, str, flag, i+cols, index+1))
                {
                    return true;
                }
            }
            flag[i] = false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        char[] matrix = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        int rows = 3;
        int cols = 4;
        char[] str = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        boolean res = hasPath(matrix, rows, cols, str);
        System.out.print(res);

    }
}
