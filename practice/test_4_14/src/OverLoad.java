import java.util.Scanner;

/**
 * @Description:  方法的重载
 * @Author: Cheng
 * @Create: 2020-04-14 15:49
 **/


//--------------求两个int最大  double最大  两个double 一个int最大值 用重载
public class OverLoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = sc.nextInt();

        System.out.println(Max(a, b, c));

    }
       public static int Max (int x , int y ) {
            return x>y?x:y;
        }
        public static double Max(double x, double y) {
            return x>y?x:y;
        }
        public static double Max(double a, double b, int c) {
            return (a>b)?(a>c?a:c):(b>c?b:c);
        }
}



