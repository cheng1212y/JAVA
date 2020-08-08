import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:  数组
 * @Author: Cheng
 * @Create: 2020-04-13 17:13
 **/
//
//数组 : 存放相同数据类型的集合。内存是连续的。
//        new:实例化一个对象   内存
//        栈上的地址  是拿不到的
//        堆上的地址  可以打印 但是不是真实的   但是  你可以当做是真时的。地址也是唯一的。
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int i = 0;
        System.out.println("请输入数组的元素");
        for (i= 0; i<arr.length;i++) {                  //循环自动的录入一个数组
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }








//        public static void main1(String[]args) {
//         int [] arr = {1,2,3,4,5};
//            myPrintf( arr);
//        }
//        public static void  myPrintf(int [] arr) {    //手动实现Arrays.toString
//            System.out.print("[");
//            int i =0;
//            for (i=0;i<arr.length;i++) {
//                System.out.print(arr [i]);       //.length可以直接求数组的长度
//                if (i!=arr.length-1)
//                System.out.print(",");
//            }
//            System.out.println("]");
//        }

}
