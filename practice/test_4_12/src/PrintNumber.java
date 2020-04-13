import java.util.Scanner;

/**
 * @Description: 输入1234  打印 1 2 3 4
 * @Author: Cheng
 * @Create: 2020-04-12 21:43
 **/
public class PrintNumber {

    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        xixi(a);
    }
    public static void xixi(int a ) {
        if (a>9) {
            xixi( a / 10);     //xixi函数递归调用自己 输入1234 打印的是 1 2 3 4
        }
        int r = a % 10;
        System.out.print(r+" ");
    }

}
