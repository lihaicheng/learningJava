package languageDemo.looper;

public class outer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        aa:
        for (int j = 0 ; j < 4 ; j++)
        {
            for (int i = 0 ; i < 5 ; i ++)
            {
                sb.append(i);
                if (j == 2)
                {
                    //break aa;
                    continue aa;
                }
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }
}
