package com.msi.demo2;

/**
 * @Description:  动态绑定  和 向上转型
 * @Author: Cheng
 * @Create: 2020-04-28 15:46
 **/
class Animal {
    protected int age;

    protected String name;

 public Animal(String name) {
        this.name = name;
        System.out.println("Animal构造器");

        eat();/** 在构造器中调用重写的方法 会触发动态绑定 */
    }
    public void eat() {
        System.out.println(this.name+"   Animal::eat()");
    }
}


class Cat extends Animal{
    public int count = 99;
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        //super.name = "hhhh";
        System.out.println("Cat构造器");
    }

    @Override
    public void eat() {//------------------------猫的eat方法被重写 向上转型的猫此时会调用它 不再调用父类的
        System.out.println(this.name+"猫自己想实现个吃方法Cat::eat()");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }
}



public class TestMain {

    public static void main(String[] args) {
        Animal animal = new Animal( "动物");
        animal.age = 100;
        System.out.println(animal.age);

    }





    //正确使用向下转型 使用 instanceof 关键字
    public static void main6(String[] args) {
        Animal animal = new Cat("八个"); //向上转型
        //A instanceof B   判断A 是不是 B的一个实例
        if( animal instanceof  Bird ) {
            //向下转型
            Bird bird = (Bird)animal;
            bird.fly();
        }else {
            System.out.println("fafsdafsfa");
        }
    }






        /**向下转型*/
    public static void main5(String[] args) {
        Animal animal = new Bird( "八哥"); //向上转型
       // animal.fly ( ) 父类无法调子类的方法

        // 向下转型 十分不安全
        //animal强制转换为bird 前提时它已经引用的是bird对象
        Bird bird = (Bird) animal;
        bird.fly();

    }





    public static void main4(String[] args) {
        /**父类引用引用子类对象，同时通过父类引用调用同名的重写方法，此时就会发生运行时绑定*/
        Animal animal= new Cat("baozi");//向上转型： 子类对象赋值给父类引用（父类引用引用子类对象）
        animal .eat(); //猫向上转型了 但是猫自己重写了eat方法，所以会调用自己的eat方法 不再调用父类动物的eat方法


    }

    /**3返回值发生向上转型*/
    public  static Animal func() {
        return  new Cat("包子");
    }
    public static void main3(String[] args) {
        Animal animal = func();
        animal.eat();
    }



    /**2传参导致向上转型*/
    public static void func (Animal animal) {
        animal.eat();  //----------发生了向上转型
    }
    public static void main2(String[] args) {
            Cat cat = new Cat( "包子");
            func(cat);
    }






    public static void main1(String[] args) {
        /**1直接赋值向上转型*/
        Animal animal= new Cat("baozi");//向上转型： 子类对象赋值给父类引用（父类引用引用子类对象）
        //通过向上转型后，父类的引用只能访问父类自己特有的方法与属性， 不能再去访问子类的东西 count在子类中
        animal.eat();  //动物自己的eat方法
        //animal.count; 转型后 无法访问子类中的属性
    }



}
