/**
 * @Description:   实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
 * @Author: Cheng
 * @Create: 2020-04-15 12:54
 **/
public class PrintArray {
    public static void main(String[] args) {
        int [] arr= {1,2,43,54,52,3};
        myPrint ( arr);
    }
    public  static void  myPrint (int [] arr) {
        int i  = 0;
        for (int x: arr) {
            System.out.print (x+ " ");
        }
    }
}
