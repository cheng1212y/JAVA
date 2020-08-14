package com.a;

/**
 * @Description:  字符串的查找 与拆分
 * @Author: Cheng
 * @Create: 2020-05-11 12:26
 **/
public class Test {






    /** --------------字符串的拆分-----------*/
    public static void main6(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings1 = str.split("&");
        //[name=zhangsan]  [age=18]
        //  0                  1
        for ( String s1 :strings1 ) {
            String[] strings2 = s1.split("=");
            for (String s2 :strings2) {
                System.out.println(s2);
            }
        }
    }

    public static void main5(String[] args) {
        String str="Java-split#bit";
        String[] strings = str.split(" |-|#"); //拆分多个符号 前面空格一下 后面用 | | 做连字符
        for (String s : strings) {
            System.out.println(s);
        }   //|-|#
    }

    public static void main4(String[] args) {
        String str = "192.168.1.1";
        String [] strings = str.split("\\."); //转义字符一般加上两个斜杠
        for ( String s : strings) {
            System.out.println(s);
        }
    }

    public static void main3(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" "); //按照空格将字符串进行拆分 ，按照数组长度为2拆分
        //[abc] [de] [f]
        for (String s : strings) {
            System.out.println(s);
        }
    }


    /** --------------字符串的查找-----------------*/
    public static void main2(String[] args) {
        String str = "ababcabcbababc";
        int index = str.indexOf("abc"); //寻找子串 从头开始找到第一次出现的就返回起始的下标、否则-1
        int index2 = str.indexOf("abc",3); //从头开始 下标位置开始找


        int index3 = str.lastIndexOf("abc"); //从后往前找 但是abc的顺序没有逆
        int index4 = str.lastIndexOf("abc",3); //3没有意义 只是指定位置找，但是匹配上abc就返回



        boolean flg2 = str.startsWith("aba",0);//开头是从abc开始？ 0号位置偏移量0
        boolean flg3 = str.endsWith("c");



        System.out.println(index);
        System.out.println(index2);
        System.out.println("-----------------");
        System.out.println( index3);
        System.out.println( index4);
        System.out.println("-----------------");
        System.out.println(flg2);
        System.out.println(flg3);




    }

    public static void main1(String[] args) {

        String str = "abcfdjslfhlabc";
        boolean flg = str.contains("abc");      //判断子字符串是否存在
        System.out.println(flg);

    }





}
