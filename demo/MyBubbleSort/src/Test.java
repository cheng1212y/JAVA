import java.util.Arrays;

/**
 * @Description:  手动冒泡排序    优化部分来源于 对每一趟排完后检查是否有序
 * @Author: Cheng
 * @Create: 2020-04-16 14:41
 **/
public class Test {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4 };
        sort(arr);
        System.out.println(Arrays.toString( arr));
    }

    public static void sort( int[] arr) {
        int i = 0;
        int j = 0;
        for (i= 0;i<arr.length-1;i++) {
            boolean f =true; //没有发生交换
            for(j = 0;j<arr.length-1-i;j++) {
                if ( arr[j] > arr[j+1] ) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    f= false;
                }
            }
            if (f == true)    //--------------检查每一趟排完后 是否已经顺序了，好了就直接跳出（假如第二趟后直接有序，后面的就不用）
                break;
        }

    }
}
