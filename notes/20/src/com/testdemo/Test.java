package com.testdemo;

/**
 * @Description:  字符串的逆置
 * @Author: Cheng
 * @Create: 2020-05-11 14:55
 **/
public class Test {
    public static String reverse(String str,int begin,int end) {
        char [] ret = str.toCharArray();  //先转换为数组
        char tmp = ' ';
        while ( begin < end) {
            tmp = ret [begin];
            ret [begin] = ret [end];
            ret [end] = tmp;
            begin++;
            end--;
        }
      //  return String.copyValueOf(value);  返回值字符数组转字符串的另一种方式
        return new String( ret );
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
