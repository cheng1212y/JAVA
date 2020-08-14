package com.c;

/**
 * @Description:   StringBuffer 和 StringBuilder
 * @Author: Cheng
 * @Create: 2020-05-11 15:28
 **/


/**     String和StringBuffer类不能直接转换。如果要想互相转换，可以采用如下原则:
        String变为StringBuffer:利用StringBuffer的构造方法或append()方法
        StringBuffer变为String:调用toString()方法
 */


/**
 * a、String的内容不可修改，StringBuffer与StringBuilder的内容可以修改.
 * b、StringBuffer与StringBuilder大部分功能是相似的
 * c、StringBuffer采用同步处理，属于线程安全操作；而StringBuilder未采用同步处理，属于线程不安全操作
 * */

public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg");              // String变为StringBuffer:利用StringBuffer的构造方法或append()方法

        stringBuffer.reverse(); //stringBuffer 与StringBuilder中的某些方法，String不具备的 如reserve逆置
        System.out.println(stringBuffer);



//        String ret = stringBuffer.toString();         //StringBuffer变为String:调用toString()方法
//        System.out.println(ret);

    }

    public static void main2(String[] args) {
       // StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder(); //这种拼接就只会产生一份对象 因为append方法返回值是this 当前对象的引用
        stringBuilder.append("asa");
        stringBuilder.append(222).append('a').append(3.0).append("dsada");
        System.out.println(stringBuilder);
    }

    public static void main1(String[] args) {
         String str = "abcdef";
         str =  str + "hello";  //+拼接每次拼接都会产生大量的临时对象 造成了空间的浪费
         System.out.println(str);


    }
}
