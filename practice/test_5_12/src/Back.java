import java.util.Scanner;

/**
 * @Description:   根据输入位置 左边放右边 右边放左边
 *  *
 *  * 输入：abcdefg  3
 *  * 输出：defgabc
 * @Author: Cheng
 * @Create: 2020-05-19 15:49
 **/
public class Back {

    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        return new String(value);
        // return String.copyValueOf(value);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();    //输入字符串
        int k = scanner.nextInt();      //输入逆置的位置
        str =  reverse(str, 0,k-1);   //逆置前
        str = reverse(str, k,str.length()-1); //逆置后
        str = reverse(str, 0,str.length()-1);//整体逆置
        System.out.println(str);
    }
}
