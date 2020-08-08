import java.util.Arrays;
/**
 * @Description:  有关数组的四种拷贝方式，
 * @Author: Cheng
 * @Create: 2020-04-15 18:45
 **/
     public class Test {
//     * 数组的拷贝 有 4种方式：
//     * for
//     * Arrays.copyOf
//     * System.arraycopy
//     * clone() ：产生了这个对象的一个 副本   这个方法是Object的克隆方法
//     * Object：是所有类的父类。祖先
//     * 从本质上来说  都是浅拷贝。
//     * 深拷贝：数组的内容是简单类型，例如int之类的，修改arr2内的元素，不会影响arr1里面的内容。
//     * 浅拷贝：数组中存放的是引用类型(地址)，修改了arr2的元素，就改变了arr1的内容。



////-----------第一种 for循环拷贝数组-------------
//    public  static int [] copyArray(int [] array) {   //  手动拷贝数组 是深层拷贝
//        int [] re = new int [array.length];
//        int i =0;
//       for (i = 0;i<array.length;i++) {
//           re[i]=array[i];
//        }
//        return re;
//    }
//    public static void main(String[] args) {
//       int[]   array = { 1,2,3,4,5,6,7};
//        int[] ret =copyArray(array);
//       System.out.println(Arrays.toString(ret));
//
//    }
//
//
//
//----------------第二种Arrays.copyOf( ),会返回新的对象-----------

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] ret = Arrays.copyOf(arr,arr.length);
//       // int[] ret = Arrays.copyOfRange(arr, 2, 7);     //copyOfRange 可以指定长度，[from , to )
//        System.out.println(Arrays.toString(ret));
//    }
//
//


//
////------------第三种 System.arraycopy（），这是native方法，速度最快------------
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] ret = new int [arr.length];
////                       源数组   开始拷贝位置    目的数组 考到那个位置 考多长
//        System.arraycopy(arr,0,ret,0,arr.length);
//        System.out.println(Arrays.toString(ret));
//    }
//
//
//

////-------------第四种 源数组名.clone()，产生了这个对象的一个副本。这个方法是object的克隆方法----------
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] ret = arr.clone();
//        System.out.println(Arrays.toString(ret));
//    }


    public static void main(String[] args) {        // 填充数组 fill

        int []arr1 = new int [6];
        Arrays.fill(arr1,6);
        System.out.println(Arrays.toString(arr1));
    }



}





