package nowcoder.practice.offer.section7;

public class O67 {
    public static int err = 0;
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0)
        {
            err = -1;
            return 0;
        }
        char[] chars = str.toCharArray();
        if (chars[0] != '+' && chars[0] != '-' && !(chars[0] >= '0' && chars[0] <= '9'))
        {
            err = -2;
            return 0;
        }
        for (int i = 1 ; i < chars.length ; i++)
        {
            if (!(chars[i] >= '0' && chars[i] <= '9'))
            {
                err = -2;
                return 0;
            }
        }
        int res = 0;
        if (chars[0] == '+')
        {
            for (int i = 0 ; i < chars.length-1 ; i++)
            {
                res += (Math.pow(10,i) * (chars[chars.length-1-i] - '0'));
            }
        }
        else if ((chars[0] >= '0' && chars[0] <= '9'))
        {
            for (int i = 0 ; i < chars.length ; i++)
            {
                res += (Math.pow(10,i) * (chars[chars.length-1-i] - '0'));
            }
        }
        else
        {
            for (int i = 0 ; i < chars.length-1 ; i++)
            {
                res -= (Math.pow(10,i) * (chars[chars.length-1-i] - '0'));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "+1";
        int res = StrToInt(str);
        if (err == 0)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("err:"+err);
        }
//        int i = Integer.parseInt("+14");
//        System.out.print(i);


    }
}
