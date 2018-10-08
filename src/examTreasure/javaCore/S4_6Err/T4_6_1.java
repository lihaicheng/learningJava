package examTreasure.javaCore.S4_6Err;

public class T4_6_1 {
    public static void main(String[] args) {
        System.out.println(retrunN());
    }
    public static int retrunN()
    {
        try {
            int i = 3/0;
            return 1;
        }
        catch (Exception e)
        {
            return 2;
        }
        finally {
            return 3;
        }
    }
}
