import java.util.Scanner;

/**
 * @Description:  迭代法求斐波那契跟快速
 * @Author: Cheng
 * @Create: 2020-04-12 21:58
 **/
public class FibonacciP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = b + a;
            a = b;
            b = c;
        }
        return c;

    }
}
