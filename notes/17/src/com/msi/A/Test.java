package com.msi.A;

/**
 * @Description:     多态
 * @Author: Cheng
 * @Create: 2020-04-29 11:54
 **/


/**
 * 什么是多态：思想
 *  1、父类引用 引用子类对象
 *  2、父类和子类有同名的覆盖方法
 *  3、通过父类引用调用这个重写的方法的时候。  多态。
 */

//优点  a 封装是让类的调用者不需要知道类的实现细节.多态能让类的调用者连这个类(Shape)的类型是什么都不必知道, 只需要知道传过去的对象(cycle)具有某个方法即可.因此, 多态可以理解成是封装的更进一步, 让类调用者对类的使用成本进一步降
//      b 能够降低代码的 "圈复杂度", 避免使用大量的 if - else
//      c 可扩展能力更强.如果要新增一种新的形状, 使用多态的方式代码改动成本也比较低



class Shape {   // 关注父类的代码, 就能够同时兼容各种子类的情况
    public void draw ( ) {

    }
}

class Cycle extends Shape {
    @Override  //       方法是被重写的 防止重写的时候失误出现命名错误等 提前报错
    public void draw() {
        System.out.println("○");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("口");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}

public class Test {

  /* 圈复杂度高
   public static void drawShapes1() {
        React rect = new React();
        Cycle cycle = new Cycle();
        Triangle flower = new Triangle();
        String[] shapes = {"cycle", "react", "cycle", "react", "triangle"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("triangle")) {
                flower.draw();
            }
        }
    }*/
    /**多态降低了代码的圈复杂度*/
    public static void main5(String[] args) {
        //我们创建了一个 Shape 对象的数组.
        //Shape shape2 = new Cycle();
        Shape [ ] shapes =  {new Cycle(), new Rectangle(),new Flower()};//向上转型了
        for (Shape shape:shapes) {
            shape.draw();//发生了多态
        }
    }


    public static void drawShape (Shape shape ) { //不关心shape这个引用引用了那个对象 只要重写了draw方法 就会发生运行时绑定

        shape.draw(); /** 此时shape调用了哪个draw方法 不知道 取决于它引用的是哪个对象，
                        指向的对象不一样，调用的draw方法也不一样，
                        draw方法因为引用不同对象表现形式不一样  这样就是多态*/

    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle(); //向上转型
        Shape shape2 = new Rectangle();
        Shape shape3 = new Flower();
        drawShape ( shape1);
        drawShape(shape2);
        drawShape(shape3);

    }



}
