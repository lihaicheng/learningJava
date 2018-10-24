package aoapc_bac2nd.C1;

public class E1_1 {
    public static void area(double r, int h)
    {
        double areaLow = 2 * Math.PI * r * r;
        double areaSide = 2 * Math.PI * r * h;
        double area =  areaLow + areaSide;
        //area = (double) Math.round(area * 1000) / 1000;
        System.out.print(area);
    }
    public static void main(String[] args) {
        double r = 3.5;
        int h = 9;
        area(r, h);
    }
}
