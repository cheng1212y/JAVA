/**
 * @Description: 方法练习题
 * @Author: Cheng
 * @Create: 2020-04-14 15:27
 **/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {  //方法调用
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(MaxP( a ,  b , c ));
    }
    public static int Max(int a , int b ) {  //计算前两个数最大值
        return a>b?a:b;
    }
    public static int MaxP(int a , int b ,int c ) {  //计算后两个数最大值

             int r = Max(a,b);
             return r>c?r:c;
    }
}
