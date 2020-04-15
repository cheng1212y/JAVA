import java.util.Arrays;
/**
 * @Description: 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
 * @Author: Cheng
 * @Create: 2020-04-15 13:00
 **/
public class TestS {
    public static void main(String[] args) {
        System.out.println("请输入数组大小");
        int[] arr = new int [100];
       int i =0;
        for (i = 0;i<arr.length;i++) {
            arr[i] =i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
