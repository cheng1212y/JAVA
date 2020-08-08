/**
 * @Description: 方法的重载
 * @Author: Cheng
 * @Create: 2020-04-12 21:16
 **/
//针对同一个类:
//        方法名相同
//        方法的参数不同(参数个数或者参数类型)
//        方法的返回值类型不影响重载
//

public class OverLoad {
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2;
        int c = 3;

        System.out.println(sum(a,b,c));
        double e = 2.4;
        double f =6.0;
        System.out.println(sum(e,f));

    }
    public static int sum(int a , int b, int c) {
        return (a + b + c);
    }
    public static double sum(double e ,double f) {
        return (e+f);
    }
}
