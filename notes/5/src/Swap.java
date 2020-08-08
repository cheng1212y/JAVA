/**
 * @Description: 实参与形参的关系
 * @Author: Cheng
 * @Create: 2020-04-12 21:16
 **/
public class Swap {
    public static void main(String[] args) {  //错误交换
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("a = " + a + " b = " + b);
    }
    public static void swap(int x, int y) {  //形参是对实参的一份临时拷贝，形参不改变实参的值
        int tmp = x;
        x = y;
        y = tmp;
    }

}

