/**
 * @Description:    字符串 的compareTo 方法 比较他们的字典序
 * @Author: Cheng
 * @Create: 2020-05-19 15:18
 **/
public class MyCompareTo {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ab";
        System.out.println(mycompareTo(s1, s2));
    }

    //按照字典顺序比较两个字符串大小
    public static int mycompareTo(String str1,String str2)  {

        int len1 = str1.length();
        int len2 = str2.length();
        int lim = Math.min(len1, len2);
        char v1[] = str1.toCharArray();
        char v2[] = str2.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;   //字符相减 就是差值int
            }
            k++;
        }
        return len1 - len2;         //前面的字符都相同 直接返回长度差
    }
}
