/**
 * @Description:  手动二分查找    < = 的条件要注意   >>>1 相当于除以2
 * @Author: Cheng
 * @Create: 2020-04-16 14:01
 **/
public class Test {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,5,99};
        System.out.println(find(arr, 99));
    }
    public static int find (int [] arr,int k) {
        int left = 0;
        int right = arr.length-1;
        int mid  = 0;
        while (left <= right) {      //一定是<=  找最后一位 l r 在一起相遇，m的位置还没到位
            mid = (left+right)>>>1;
            if (k>arr[mid]) {
                 left = mid + 1 ;
            }
            else if (k<arr[mid]) {
                right = mid - 1 ;
            }
            else {
                    return mid;
            }
        }
            return -1;
    }
}
