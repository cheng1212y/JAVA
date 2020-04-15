/**
 * @Description:   实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 * @Author: Cheng
 * @Create: 2020-04-15 13:14
 **/
public class Average {
    public static void main(String[] args) {
        int [] arr = {2,8,1,9,5,5};
        System.out.println(avg(arr));
    }
    public static int  avg(int [] arr) {
        int i =0;
        int sum = 0;
        for (i=0;i<arr.length;i++) {
            sum = arr[i] + sum;
        }
        return  sum/arr.length ;
    }
}





