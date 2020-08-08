import java.util.Arrays;

/**
 * @Description: 数组作为参数传参
 * @Author: Cheng
 * @Create: 2020-04-15 12:15
 **/
public class TestS {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(func(arr)));     //将数组已字符串格式进行输出
    }
    public  static int [] func(int[] arr) {
        int[] ret = new int [arr.length];            //不操作原数组，将它的值扩大二倍
        int i =0;
        for (i=0;i<arr.length;i++) {
            ret[i] = arr[i]*2;
        }
        return ret;                                 //数组是可以作为返回值的
    }


//    public static void main2(String[] args) {
//         int [] arr = {1,2,3,4,565,4};                //Arrays 把他叫做  操作数组的工具类
//        System.out.println(Arrays.toString(arr));    //数组以字符串的形式输出，要引用Arrays包
//    }



//    public static void main1(String[] args) {
//        int [] arr ={ 1,2,3,4,5};           //静态初始化
//        printarr(arr);
//    }
//    public static void printarr (int [] a) {
//        for (int x: a ) {
//            System.out.println(x);     ////for each也可以遍历数组
//        }
//    }
}
