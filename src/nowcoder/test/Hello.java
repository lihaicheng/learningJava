package nowcoder.test;

public class Hello {
    public static void test_copy_arr(boolean[] flag)
    {
        boolean[] new_flag = new boolean[flag.length];
        System.arraycopy(flag, 0 ,new_flag, 0, flag.length);
        new_flag[0] = true;
        System.out.print(new_flag[0]);
    }

    public static void main(String[] args) {
        //System.out.print("helloword");
        boolean[] flag = new boolean[1];
        test_copy_arr(flag);
        System.out.print(flag[0]);
    }
}
