/**
 * @Description: 方法的重载
 * @Author: Cheng
 * @Create: 2020-04-14 16:24
 **/
//---------在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果

public class OverLoadS {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ret = add(a, b);
        System.out.println("ret = " + ret);

        double a3 = 10.5;
        double b3 = 10.5;
        double c3 = 20.5;
        double ret3 = add(a3, b3, c3);
        System.out.println("ret3 = " + ret3);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }
}

