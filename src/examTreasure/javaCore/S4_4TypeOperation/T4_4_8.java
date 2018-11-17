package examTreasure.javaCore.S4_4TypeOperation;

public class T4_4_8 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ + " " + i);// 1
        i = 1;
        System.out.println(++i + " " + i);// 2
        i = 1;
        // a = i;i = i + 1;i = i + a;
        System.out.println(i+++i++ + " " + i);
        i = 1;
        // i = i = 1;a = i;i = i + a;
        System.out.println(++i+i + " " + i);
    }
}
