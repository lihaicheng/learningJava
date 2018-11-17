package languageDemo.string;

public class initString {
    public static void main(String[] args) {
        char[] val = {'a', 'b', 'c'};
        String s = new String(val, 4, 0);
        System.out.println("s=" + s);
    }
}
