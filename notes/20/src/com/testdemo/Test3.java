package com.testdemo;

import java.util.Scanner;

/**
 * @Description: 字符串的拼接
 * @Author: Cheng
 * @Create: 2020-05-11 14:56
 **/
public class Test3 {
    public static String func(String str) {
        String[] strings = str.split(" ");
        String ret = "";
        for(String s : strings) {
            ret += s;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //不能用next 遇到空格结束了
        String ret = func(str);
        System.out.println(ret);
    }
}
