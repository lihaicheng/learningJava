package nowcoder.practice.offer.section6_5;

public class O65 {
    public static int Add(int num1,int num2) {
        int sum = 0;
        int carry = 0;
        do{
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }while (carry != 0);
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 17;
        int res = Add(num1, num2);
        //int res = (num1 & num2) << 1;
        System.out.print(res);
    }
}
