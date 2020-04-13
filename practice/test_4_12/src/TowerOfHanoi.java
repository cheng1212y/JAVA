/**
 * @Description:  汉诺塔的挪动问题
 * @Author: Cheng
 * @Create: 2020-04-12 22:07
 **/

//
//实现这个算法可以简单分为三个步骤：
//        　　　　（1）     把n-1个盘子由A 移到 B；
//        　　　　（2）     把第n个盘子由 A移到 C；
//        　　　　（3）     把n-1个盘子由B 移到 C；
public class TowerOfHanoi {
    public static void main(String[] args) {
        hnts("a", "b", "c", 3);
    }

    public static void hnts(String from, String temp, String to, int n) {
        if (n == 1) {
            System.out.println(from + "------>" + to);
        } else {
            hnts(from, to, temp, n - 1);
            hnts(from, temp, to, 1);
            hnts(temp, from, to, n - 1);
        }
    }
}
