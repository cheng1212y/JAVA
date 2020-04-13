import java.util.Scanner;

/**
 * @Description:  递归的方法求Fibonacci数列的第n项
 * @Author: Cheng
 * @Create: 2020-04-12 21:54
 **/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
