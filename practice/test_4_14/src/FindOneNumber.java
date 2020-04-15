import java.util.Scanner;

/**
 * @Description: 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。  1 2 4 2 4 1 5
 * @Author: Cheng
 * @Create: 2020-04-14 17:47
 **/
public class FindOneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的大小");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数组的元素");
        int t = 0;
        for (t = 0; t < arr.length; t++) {
            arr[t] = sc.nextInt();
        }
        System.out.println("此数组如下");
        for (int x : arr) {
            System.out.print(x+ " ");
        }
        System.out.println("数组中出现一次的数是："+ find (arr));

    }
    //--------------找到出现一个数的方法-------------
        public static int find ( int [ ]arr) {
            int i = 0;
            int j = 0;
            int a = 0;
            for (i = 0; i < arr.length; i++) {
                int  count = 0;
                for (j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if (count == 1) {
                    a = arr[i];
                    break;
                }
            }
            return a;
        }
}





