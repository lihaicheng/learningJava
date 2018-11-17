package nowcoder.practice.offer.section4_3;

public class O33 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if (len == 0)
        {
            return false;
        }
        if (len == 1 || len == 2)
        {
            return true;
        }
        int start = 0;
        int end = len - 1;
        boolean res = BSTCore(sequence, start, end);
        return res;
    }
    public static boolean BSTCore(int [] sequence, int start, int end)
    {
        if (start >= end)
        {
            return true;
        }
        int root = sequence[end];
        int i = start;
        for (; i < end ; i++)
        {
            if (sequence[i] > root)
            {
                break;
            }
        }
        int j = i;
        for (; j < end ; j++)
        {
            if (sequence[j] < root)
            {
                return false;
            }
        }
        boolean resleft = BSTCore(sequence, start, i-1);
        boolean resright = BSTCore(sequence, i, j-1);
        boolean res = resleft && resright;
        return res;
    }

    public static void main(String[] args) {
        int [] sequence = {7, 4, 6, 5};
        boolean res = VerifySquenceOfBST(sequence);
        System.out.print(res);
    }
}
