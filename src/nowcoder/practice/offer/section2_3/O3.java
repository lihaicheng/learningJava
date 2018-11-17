package nowcoder.practice.offer.section2_3;

public class O3 {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length < 2)
        {
            return false;
        }
        for (int i = 0; i < length; i++)
        {
            while (numbers[i] != i)
            {
                if (numbers[i] == numbers[numbers[i]])
                {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,1,0,2,5,3};
        int length = 7;
        int[] duplication = new int[1];
        boolean res = duplicate(numbers, length, duplication);
        System.out.println(res);
        System.out.print(duplication[0]);
    }
}
