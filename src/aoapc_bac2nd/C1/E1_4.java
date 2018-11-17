package aoapc_bac2nd.C1;

public class E1_4 {
    public static void getNums(int n, int m)
    {
        int Rabbit = (m - 2 * n) / 2;
        int chicken = n - Rabbit;
        if (Rabbit < 0 || chicken < 0)
        {
            System.out.print("No answer");
            return;
        }
        System.out.print(chicken + " " + Rabbit);
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 16;
        getNums(n, m);
    }
}
