package com.msi.c;

/**
 * @Description:   单继承 但是 实现多个接口
 * @Author: Cheng
 * @Create: 2020-04-30 11:13
 **/

class Animal {
    protected String name ;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {   //真正的工程中一个接口是一个类 这里为了演示方便

    void fly ();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
//1、 一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口
//extends      implements
class Cat extends Animal implements IRunning{

    public Cat(String name) {
        super(name);  // 子类要先要帮助父类构造一下
        this.name = name;
    }
    @Override                       //方法必须重写
    public void run() {
        System.out.println(this.name + " 正在用腿跑步");
    }

}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
//继承表达的含义是  is - a 语义, 而接口表达的含义是  具有 xxx 特性
class Frog extends Animal implements IRunning,ISwimming { /**青蛙实现了多接口*/

    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+" 正在用爪子跑！");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" 正在游泳！");


    }

}

//甚至参数可以不是 "动物", 只要会跑
class Robot implements IRunning {
    @Override
    public void run() {
        System.out.println("我是机器人我用轮子跑");
    }
}

public class TestMoreInterface {
    /** 时刻让程序员忘记类型 不管接口IRunning 是哪种类型  -*/
    public static void walk ( IRunning iRunning) {  /**在这个 walk 方法内部, 我们并不关注到底是哪种动物, 只要参数是会跑的, 就行 */
        System.out.println( "我带着小伙伴去散步");
        iRunning.run();
    }

    public static void main(String[] args) {
        IRunning iRunning1 =  new Robot(); //向上转型
        walk(iRunning1);

        IRunning iRunning2 = new Frog( "青青"); //-------------直接赋值 完成了向上转型
        walk(iRunning2);                            /** 不用理会接口是谁实现的 忘记类型*/


        Cat cat = new Cat("包子"); //----------------------通过传参发生了向上转型
        walk(cat);
    }
}
