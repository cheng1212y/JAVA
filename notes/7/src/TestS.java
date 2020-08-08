import java.util.Arrays;

/**
 * @Description:  数组的操作
 * @Author: Cheng
 * @Create: 2020-04-15 19:20
 **/
public class TestS {




//    public static int max(int[] arr) {     //-------------------------找最大值
//        int i = 0;
//        int m = 0;
//        for (i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > m) {
//                m = arr[i];
//            }
//        }
//        return m;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, 999, 2, 18, 24, 76, 13};
//        System.out.println(max(arr));
//    }


//
//    //----------判断是不是升序的----------
//    public static boolean isUp( int [] arr) {
//       int i =0;
//        for (i = 0 ;i<arr.length-1;i++) {
//            if ( arr[i+1]<arr[i])
//               return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,9,4,5};
//        System.out.println(isUp(arr));
//    }
//}


//
////---------------数组的逆序---------------------
//    public static void main(String[] args) {
//        int []  arr = {1,2,3,4,5};
//        back (arr);
//        System.out.println(Arrays.toString(arr));
//    }
//public static  void  back (int [] arr) {
//     int l =0;
//     int r = arr.length-1;
//    while (l<r ) {
//        int tmp = arr[l];
//        arr[l] = arr[r];
//        arr[r]= tmp;
//        l++;
//        r--;
//    }
//}
//

//-----------------------偶数在前 奇数在后
    public static void main(String[] args) {
        int [] arr = { 6,6,6,7,7};
        transForm (arr);
        System.out.println(Arrays.toString(arr));
    }
public  static void transForm( int [] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        while (left < right && arr[left] % 2 == 0) {
            //偶数
            left++;
        }
        //left遇到奇数了
        while (left < right && arr[right] % 2 != 0) {
            right--;
        }
        //right肯定遇到偶数了
        if (left < right) {                 //加 if判断是因为 lr 可能相等 比如 66677 最后lf相等了
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

}
}