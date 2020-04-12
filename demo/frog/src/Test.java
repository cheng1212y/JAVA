/*
 * @Description:青蛙跳台阶问题 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法？
 * @Author: Cheng
 * @Create: 2020-04-12 20:02
 **/
//如果n=1，只有一种跳法，那就是1
//        如果n=2，那么有两种跳法，2，[1,1]
//        如果n=3，那么有三种跳法，[1,1,1],,[1,2],[2,1]
//        如果n=4，那么有五种跳法，[1,1,1,1],[1,1,2],[1,2,1],[2,1,1],[2,2]
//        如果n=5，那么有八种跳法，[1,1,1,1,1],[1,1,1,2],[1,1,2,1],[1,2,1,1],[2,1,1,1],[2,2,1],[2,1,2],[1,2,2]

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数：");
        int n = sc.nextInt();
        System.out.println(jump(n));
    }
    public static int jump(int n) {
        if ( n == 0 ) {
            return 0;
        }
        if ( n == 1 ) {
            return 1;
        }
        if ( n == 2 ) {
            return 2;
        }
        return jump( n - 1)+jump( n - 2); //此处递归出来台阶
    }
}
