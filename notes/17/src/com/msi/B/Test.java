package com.msi.B;

/**
 * @Description:  抽象类
 * @Author: Cheng
 * @Create: 2020-04-29 22:11
 **/
/** 抽象类：
 * 1、抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。抽象方法可以没有具体的实现。
 * 2、包含抽象方法的类，抽象类。
 * 注意：
 * 1、抽象类不可以被实例化。不能Shape shape = new Shape();
 * 2、类内的数据成员，和普通类没有区别。
 * 3、抽象类主要就是用来被继承的.
 * 4、如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
 * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被c继承，那么c一定还要重写这个抽象方法。
 * 6、抽象类或者抽象方法 一定是不能被final,static，private 修饰的(重写不支持那三个)。*/


/** 作用
 * 1 抽象类存在的最大意义就是为了被继承.
 * 2抽象类本身不能被实例化, 要想使用, 只能创建该抽象类的子类. 然后让子类重写抽象类中的抽象方法.普通的类也可以被继承呀, 普通的方法也可以被重写呀,
 * 为啥非得用抽象类和抽象方法呢?确实如此. 但是使用抽象类相当于多了一重编译器的校验.
 * 3 使用抽象类的场景就如上面的代码, 实际工作不应该由父类完成, 而应由子类完成. 那么此时如果不小心误用成父类了,
 * 使用普通类编译器是不会报错的. 但是父类是抽象类就会在实例化的时候提示错误, 让我们尽早发现问题.*/

abstract class Shape {  //一旦一个方法是抽象方法，那所在的类要声明为抽象类
    /*public int age;
    private int a;
    public void func() {                内的数据成员，和普通类没有区别。
        System.out.println( "baozi");
    }*/
    public  abstract void draw();//draw 什么都不敢 就可以加上abstract 成为一个抽象方法

}

class Cycle extends Shape {  //抽象类主要就是用来被继承的.
    @Override
    public void draw() {        //如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
        System.out.println("画一个○");
    }
}


class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个△");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}

public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
       // Shape shape = new Shape();  抽象类不可以被实例化
        Shape shape1 = new Cycle();
        Shape shape2 = new React();// 抽象类的向上转型
        drawMap(shape1);
        drawMap(shape2);
    }
}