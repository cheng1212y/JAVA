package com.a;

import java.util.Arrays;

/**
 * @Description:     String 在内存中的布局  ；对于String 的比较  == 两边是引用类型 就比较地址   ； 常量在编译的时候就已经确定了；传引用不一定能修改内容
 * @Author: Cheng
 * @Create: 2020-05-07 09:59
 **/
/**关于字符串常量池
 如 "Hello" 这样的字符串字面值常量, 也是需要一定的内存空间来存储的. 这样的常量具有一个特点, 就是不需要
 修改(常量嘛). 所以如果代码中有多个地方引用都需要使用 "Hello" 的话, 就直接引用到常量池的这个位置就行
 了, 而没必要把 "Hello" 在内存中存储两次.*/
public class Test {


    public static void main(String[] args) {
        String str = "Hello";
        //str = "hello";
        str = str.substring(3);
        System.out.println(str);
    }



    /** 字符串不可变 会生成一个全新的，不会在原来的基础上改变 字符串的拼接 要是用StringBuffer  ； StringBuiler 使用+会产生大量的临时变量*/
    public static void main9(String[] args) {
        String str = "hello" ;
        str = str + " world" ;  /** 编译的时候 不会拼接的，因为str是变量只有常量才会编译时拼接*/
        str += "!!!" ;
        System.out.println(str);
//        for (int i = 0; i < 1_0000; i++) {
//            //不敢这样拼接字符串   StringBuffer  StringBuilder
//            str+=1;
//        }
    }




    /** intern 方法
     手动入池 当前的这个字符串，在常量池当中是否存在，
     如果存在，把常量池中的引用，赋值给当前引用类型的变量*/
    public static void main8(String[] args) {
        String str2 = new String("hello").intern();
        String str1 = "hello";
        System.out.println(str1 == str2);//比较的是引用
    }


    /** 字符串比较equals比较的是内容 前面不能为null ；String重写了equals方法；一般情况下 如果调用equals ，没有重写的话，默认调用的是object的equals方法，它的实现的默认比较引用的  */
    public static void main7(String[] args) {
        String str1 = "hello";
        System.out.println(str1.equals("hello"));//1

        System.out.println("hello".equals(str1));//2 建议用这种比较方式
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用
        System.out.println(str1.equals(str2));//比较的是字符串的内容

        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }





    /** ------------传引用不一定能修改内容-------------*/
    public static void func(String str,char[] array){
        str = "abcdef";                                 //----------拷贝了原地址888；但是新指向了一个abcdef的地址999，地址从888更新为999
        array[0] = 'g';                                 //----------拷贝过来的地址777修改数组的元素成功
    }
    public static void main5(String[] args) {
        String str1 = "hello";                      //地址 888
        char[] val = {'w','o','r','d'};                         //地址 777
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);//             依然没有改变
        System.out.println(Arrays.toString(val));
    }







    public static void main4(String[] args) {
        String str1 = "hello";      //666
        String str2 = str1;         //666指向hello
        System.out.println(str1);
        System.out.println(str2);

        str1 = "abc";  //修改了str1 并不会影响str2 ，因为str1 重新指向了一个对象   ； 新指向一个abc 地址更新999

        System.out.println(str1);
        System.out.println(str2);
    }


    public static void main3(String[] args) {

       /**只要是双引号引起来的(是字符串常量) 肯定在常量池中 （"hel"+"lo"编译时期已经变成hello）
        常量在编译的时候就已经确定了*/
        String str1 = "hello";                      //常量池中创建999
        String str2 = "hel"+"lo";                   //因为是字符串常量，所以编译时候已经确定为hello，此时常量池中已经存在就不创建了；地址999
        /*final int a = 10;
        int c = a+30;*/
        System.out.println(str1 == str2);//true
        String str3 = new String("hel")+"lo";   //1先在常量池中new一个555的hel，2再创建一个333的lo；3最后在堆上组装一个888的hello
        System.out.println(str3 == str1);//false
    }


    /**-----------字符串类的里面是字符数组实现的------------------*/
    public static void main2(String[] args) {
        String str1 = "hello";                        //在常量池中 创建地址666
        String str2 = new String( "hello"  );// 常量池已经有了 ，字符串中是一个数组(堆上)地址666指向hello666(常量池)，而数组的所在的new对象地址是999，被str2 引用
        System.out.println(str1 == str2); //false

        String str3 = "hello";
        System.out.println(str1 == str3); //true        常量池已经有了 ，就直接指向666 str3为 666

    }



    //-------------------字符串的三种构造方式---------------
    public static void main1(String[] args) {
        String str1 = "hello";

        String str2 = new String("hello");

        char arr [ ] = { 'h','e','l','l','o'};
        String  str3 = new String( arr );

    }
}
