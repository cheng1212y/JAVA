package com.b;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Description:  常见的字符串 字符  字节的转换
 * @Author: Cheng
 * @Create: 2020-05-07 13:01
 **/

/**
 1、byte[] 是把 String 按照一个字节一个字节的方式处理, 这种适合在网络传输, 数据存储这样的场景下使用. 更适合针对二进制数据来操作.
 2、char[] 是吧 String 按照一个字符一个字符的方式处理, 更适合针对文本数据来操作, 尤其是包含中文的时候.
 回忆概念: 文本数据 vs 二进制数据
 一个简单粗暴的区分方式就是用记事本打开能不能看懂里面的内容.
 如果看的懂, 就是文本数据(例如 .java 文件), 如果看不懂, 就是二进制数据(例如 .class 文件*/


public class Test {


    /**------------------5字符串其他操作-----------------------------*/
    public static void main(String[] args) {


        //1去掉两边的空格---------trim
        String str = "          hello        world            " ;
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");

    }





    /**------------------4字符串截取操作-----------------------------*/

    public static void main6(String[] args) {
        String str1 = "abcdefh";
        String ret = str1.substring(3);   //代表 从这个位置截取到结束位置 3号位置截取到结束
        System.out.println(ret);

        System.out.println("------------");

        String ret2 = str1.substring(1,4);//[1,4)       //截取的区间是左闭右开
        System.out.println(ret2);

    }






    /**------------------3字符串替换操作-----------------------------*/
    public static void main5(String[] args) {
        //由于字符串是不可变对象, 替换不修改当前字符串, 而是产生一个新的字符串
         String str1 = "aabcdaeaa";
        String ret = str1.replaceAll("aa","Y");  //替换所有指定内容； replace 和replaceAll一样效果
        System.out.println(ret);                                    //里面是字符串、字符都可以
        System.out.println("----------------");

        String ret3 = str1.replaceFirst("aa","U");//替换第一次出现的子串
        System.out.println(ret3);

    }




    /**------------------3字符串比较操作-----------------------------*/

    public static void main4(String[] args) {
        String str1 = "abcd";
        String str2 = "abcdtt";
        System.out.println(str1.equals(str2));              //比较相等？
        System.out.println(str1.equalsIgnoreCase(str2));    //忽略大小写比较

        System.out.println(str1.compareTo(str2));           //比较两个字符串大小关系
        System.out.println("包".compareTo("子"));            /**字符串的比较大小规则, 总结成三个字 "字典序"
                                                            /相当于判定两个字符串在一本词典的前面还是后面. 先比较第一
                                                            个字符的大小(根据 unicode 的值来判定), 如果不分胜负, 就依次比较后面的内容*/
        System.out.println("A".compareTo("a")); // -32
        System.out.println("a".compareTo("A")); // 32
        System.out.println("A".compareTo("A")); // 0
        System.out.println("AB".compareTo("AC")); // -1
        //str1 > str2   正数
        //str1 < str2   负数
        //str1 == str2  0


    }









    /**------------------2字节与字符串-----------------------------*/
    public static void main3(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97,98,99,100};   //unicode
        String str = new String(bytes);   //字节数组转化为字符串 ； 也可以带偏移量
        System.out.println(str);

        String str2 = "abcdef";
        byte [] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes)); //字符串转字节数组返回

        System.out.println("-----------------");

        String str3 = "包子";
        byte [] bytes2 = str3.getBytes("gbk");  // 编码转换了解
        System.out.println(Arrays.toString(bytes2));
    }









    /**------------------判断字符串是不是全由数字组成-----------------------------*/
    public static boolean  func (String str) {
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if ( ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "2141341";
        boolean ret = func(str);
        System.out.println(ret);
    }
   //方法二
//    public static boolean isNumber(String str) {
//        char[] data = str.toCharArray() ;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i]<'0' || data[i]>'9') {
//                return false ;
//            }
//        }
//        return true ;
//    }



    /**------------------1字符与字符串-----------------------------*/
        public static void main1(String[] args) {
            char[] val = {'a','b','c','d','e'};
            String str = new String(val,1,4);   //将字符数组中的所有内容变为字符串；加数字是带偏移量，1 起始位置，3为长度
            System.out.println(str);

            String str2 = "hello";
            char ch = str2.charAt(2);    //取得指定位置的字符
            System.out.println(ch);

            char[] val2 = str2.toCharArray();          //字符串转换为字符数组返回
            System.out.println(Arrays.toString(val2));
        }
}
