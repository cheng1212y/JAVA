import java.util.Scanner;

/**
 * @Description:  输入 123 计算123的和
 * @Author: Cheng
 * @Create: 2020-04-12 21:48
 **/
public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(sum(a));
    }


    public static int sum(int a) {  //求一个数123 各个位相加的和 输出6
        if (a < 10)                 //方法的位置与main方法无关
            return a;
        else{
            return a % 10 + sum(a / 10);
        }
        //递归调用自己
    }
}