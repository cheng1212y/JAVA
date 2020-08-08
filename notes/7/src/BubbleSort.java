import java.util.Arrays;

/**
 * @Description:  冒泡排序
 * @Author: Cheng
 * @Create: 2020-04-15 20:33
 **/
public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            boolean a =false; //没发生交换
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                  a = true; //交换了
                }
            }
            if (a ==false)
            break;
        }
    }
    public static void main(String[] args) {
         int [ ] arr= {10,9,8,7,6,5,4,3,2,1};
         bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
