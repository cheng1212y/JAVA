package com.b;

/**
 * @Description: 字符串的其他方法
 * @Author: Cheng
 * @Create: 2020-05-11 14:41
 **/
public class Test {

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.length());//长度是方法
        int [] ret = {1,2,3,4,5,6,7};
        System.out.println(ret.length); //长度是属性
        String string = ""; //空串
        String string2 = null; //指向的是一个空对象
        boolean ret1 = string.isEmpty();  //测字符串是否为空
        System.out.println(ret1);
    }
    public static void main1(String[] args) {
        String  str = "abcfFGKASaaf";
        String ret  = str.toUpperCase();  //字符串转大写
        String ret1  = str.toLowerCase();  //字符串转小写
        System.out.println(ret);
        System.out.println(ret1);
    }
}
