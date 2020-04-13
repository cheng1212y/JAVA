import java.util.Scanner;

/**
 * @Description:  计算1+到100的值
 * @Author: Cheng
 * @Create: 2020-04-12 21:41
 **/
public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n==1) {
            return 1;
        }
        return n+sum (n-1);
    }
    }

