package com.msi.c;

/**
 * @Description:    接口
 * @Author: Cheng
 * @Create: 2020-04-29 22:50
 **/

/**
 * 接口(interface)：
 * 1、抽象类中还可以包含非抽象方法, 和字段. 而接口中包含的方法都是抽象方法, 字段只能包含静态常量.
 * 2、其实可以有具体实现的方法。这个方法是被default修饰的（JDK1.8加入的）
 * 3、如果一个类 实现了这个接口，那么这个类必须重写接口当中的抽象方法
 * 4、接口当中的成员变量默认是：public static final   成员方法是：public abstract
 * 5、接口是不可以被实例化的。        Shape shape = new Shape();
 * 6、接口和类之间的关系 : implements
 * 7、为了解决Java单继承的问题.可以实现多个接口。后面会讲。
 * 8、只要这个类 实现了该接口，那么你就可以进行向上转型了。
 */
interface IA {
    void funa ( );
}
 interface IB {
    void funb () ;

 }
interface IC extends IA,IB { //一个借口可以扩展多个接口， 并且不需要重写父接口的方法
    void func ();
}
class A implements IC {     //但是当一个 普通类实现了一个 扩展的接口 ，他需要重写扩展接口的所有方法
    @Override
    public void funa() {
    }
    @Override
    public void funb() {
    }
    @Override
    public void func() {
    }
}



interface IShape {  //我们创建接口的时候, 接口的命名一般以大写字母  I 开头.
                                                    // 接口的命名一般使用 "形容词" 词性的单词
    public static final int a = 10; // 默认静态常量 可省略
    public  abstract  void draw ( ); //默认是 抽象类 可省略

   /* default void  func ( ) {  2其实可以有具体实现的方法。这个方法是被default修饰的（JDK1.8加入的）
    }*/

}
class Cycle implements IShape {  //   接口和类之间的关系 : implements
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class React implements IShape {
    @Override                       //必须重写接口的方法
    public void draw() {
        System.out.println("画一个♦");
    }
}
public class Test {
    public static void drawMap(IShape shape) {
        shape.draw();
    }
    public static void main(String[] args) {

      //  Shape shape = new  Shape ( ); 接口是不可以被实例化的。

        IShape shape1 = new Cycle(); //只要这个类 实现了该接口，那么你就可以进行向上转型了。
        IShape shape2 = new React(); //在调用的时候同样可以创建一个接口的引用, 对应到一个子类的实例
        drawMap(shape1);
        drawMap(shape2);
    }
}

