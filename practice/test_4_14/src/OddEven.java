/**
 * @Description:  数组----------------调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 * @Author: Cheng
 * @Create: 2020-04-14 22:42
 **/
public class OddEven {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8,55,99,4,100};
        for (int x:  arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        OneThree(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void OneThree (int[] arr) {
        int i = 0;
        int j = 0;
        for(i=0;i<arr.length-1;i++) {
            for (j=i+1;j<arr.length;j++) {  //有点像是冒泡排序的，一直把奇数往左边移动
                if ( arr[j] % 2 != 0) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
