package com.msi.demo1;

/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-28 12:21
 **/
class Base {
    public  int a ;

}
class Derive extends Base {
    public int b;
}
public class TestDemo2 {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;  // 子类继承了父类的a
    }
}
