import java.util.Scanner;

/**
 * @Description: 求N的阶乘 使用递归
 * @Author: Cheng
 * @Create: 2020-04-12 21:32
 **/
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
         }

        public static int sum (int n) {
            if (n==1) {
                return 1;
            }
            return n* sum (n-1);
        }
}

