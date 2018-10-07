package chip;

public class TestChinese {
    public static void 打印()
    {
        int a = -6;
        for (int i = 0 ; i < 32 ; i++)
        {
            int t = (a & 0x80000000 >>> i) >>> 31-i;
            System.out.println(t);
        }

    }
    public static void main(String[] args) {
        打印();
    }
}
