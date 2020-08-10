import java.util.Arrays;

/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-17 12:59
 **/
public class TestDemo {
    //----------------规则的二维数组-------------------
//    public static void main(String[] args) {
//        int[] []  arr = {{1,2,3},{4,5,6}  };


//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {  //-------------for遍历，arr[i] i 号下标保存的数组元素 ，在内存中相当于是数组456的引用
//                System.out.print(arr[i][j]+" ");       //----------二位数组实际上是一维数组  array数组中的两个元素是引用
//            }
//            System.out.println();
//        }
//
//        for (int [] tmp :arr) {                        //-----------------for each遍历，arr的元素是两个引用，使用数组接受， tmp中的使用 int接收
//            for( int x : tmp ) {
//                System.out.print( x + " ");
//            }
//            System.out.println();
//        }
//

    //  System.out.println(Arrays.deepToString(arr)); //-------------deepToString 可以遍历二维数组
//    }


//    //-----------不规则的二维数组-----------------------
//    public static void main(String[] args) {
//        int [] [] arr = new int [2][];
//        arr[0] = new int [] {1 ,2,3,4,5 };
//
//    }


//    //注意：C语言  是可以指定列  行可以自动推导
//    // Java  行必须指定    列  不可以自动推导的
//    //-----------不规则二维数组--------------
//    public static void main(String[] args) {
//        int [] [] arr = new int[2][];  //----------------列未指定，可以等下一步
//        arr[0]= new int[]{1,2,3};
//        arr[1]= new int[]{1,2,3,4,5,6};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }


}










