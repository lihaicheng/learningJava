package leetcode.VirtualGame.weeklyContest83;

public class T831 {
    public static void toLow(char[] chars)
    {
        for (int i = 0 ; i < chars.length ; i++)
        {
            if ('A' <= chars[i] && chars[i] <= 'Z')
            {
                chars[i] += 'a' - 'A';
            }
        }
    }
    public static String maskPII1(String S) {
        String[] names = S.split("@");
        String res = "";
        if (names.length == 2)
        {
            //输入邮箱
            char[] name1 = names[0].toCharArray();
            char[] name2 = names[1].toCharArray();
            char[] name = new char[name2.length + 8];
            name[0] = name1[0];
            for (int i = 1 ; i < 6 ; i ++)
            {
                name[i] = '*';
            }
            name[6] = name1[name1.length - 1];
            name[7] = '@';
            for (int i = 0 ; i < name2.length ; i ++)
            {
                name[i+8] = name2[i];
            }
            toLow(name);
            res = String.valueOf(name);
        }
        else
        {
            //输入号码
            char[] mob = S.toCharArray();
            int len = 0;
            char[] last = new char[4];
            int index = 3;
            for (int i = mob.length-1 ; i >= 0 ; i--)
            {
                if ('0' <= mob[i] && mob[i] <= '9')
                {
                    if (index >= 0)
                    {
                        last[index] = mob[i];
                        index--;
                    }
                    len++;
                }

            }
            char[] mobile;
            if (len > 10)
            {
                mobile = new char[len+4];
            }
            else
            {
                mobile = new char[len+2];
            }
            for (int i = 0 ; i < mobile.length ; i++)
            {
                mobile[i] = '*';
            }
            if (len > 10)
            {
                mobile[0] = '+';
                mobile[len - 10 + 1] = '-';
            }
            mobile[mobile.length - 1 - 4] = '-';
            mobile[mobile.length - 1 - 4 - 4] = '-';
            for (int i = 0 ; i < 4 ; i++)
            {
                mobile[mobile.length - 1 - i] = last[3-i];
            }
            res = String.valueOf(mobile);
        }
        return res;
    }

    public static String maskPII(String S) {
        if (S.contains("@"))
        {
            S = S.toLowerCase();
            int index = S.indexOf('@');
            return S.charAt(0) + "*****" + S.substring(index-1);
        }
        else {
            String last = "";
            int len = 0;
            for (int i = S.length() - 1; i >= 0; i--)
            {
                if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
                {
                    if (len < 4)
                    {
                        last = S.charAt(i) + last;
                    }
                    len++;
                }
            }
            if (len == 10)
            {
                return "***-***-" + last;
            }
            else
            {
                String fast = "+";
                for (int i = 0 ; i < len - 10 ; i++)
                {
                    fast += "*";
                }
                return fast + "-***-***-" + last;
            }
        }
    }
    public static void main(String[] args) {
        String S = "86-(10)12345678";
        String res = maskPII(S);
        System.out.println(res);
    }
}
