import java.util.Arrays;

/**
 * @Description:  二分查找
 * @Author: Cheng
 * @Create: 2020-04-15 19:48
 **/
public class Search {
    public static int binarySearch(int[] arr,int k) {
        int l = 0;
        int r = arr.length-1;
        int m = 0;
        while (l <=r) {
            m = (l + r) / 2; //无符号右移 相当于除法
            if (k > arr[m]) {
                l = m + 1;
            } else if (k < arr[m]) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]  arr = { 2,5,8,9,13};
        System.out.println( binarySearch(arr,13));
    }

//
//    public static void main(String[] args) {   //--------------------顺序查找数组中有没有元素
//        int[]  arr = { 1,2,3,4,5,6,7};
//        System.out.println(find(arr, 7));
//    }
//    public static int  find ( int [] arr,int k ) {
//        int i =0;
//        for (i=0;i<arr.length;i++) {
//
//            if (k == arr[i])
//                return i ;
//        }
//        return -1;
//    }



}
