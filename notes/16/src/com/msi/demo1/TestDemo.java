package com.msi.demo1;

/**
 * @Description:  继承 ：   继承了除构造方法外的所有
 * @Author: Cheng
 * @Create: 2020-04-28 11:59
 **/
class Animal {
    protected String name ;//-----成员属性 name  protected 体现了封装与继承 注意:不同包中只有子类才可以访问，相同包随意

    public Animal ( String name ) {
        this.name = name;
        System.out.println("Animal ----------构造器 "+ this.name );

    }

    public void eat() { //成员方法
        System.out.println(this.name + "Animal-----------eat( )");
    }

    private void sleep() { //成员方法
        System.out.println("Animal-----------sleep()");
    }

}

class  Cat extends Animal {  //------猫继承了动物除去构造方法外的所有
    public Cat ( String name ) {
       //必须放在构造器的第一行 和this一致
        super( name );   /**对于继承而言，子类会默认调用父类的构造器，但是如果没有默认的父类构造器，子类必须要显示的调用父类的构造器，而且必须是在子类构造器中做的第一件事(第一行代码)*/
        //显示调用了父类的构造方法 不是继承
        super.name = "super 可以访问父类的属性";
        super.eat(); //访问父类的方法
        System.out.println("cat ----------构造器 ");
    }
}

//被final修饰的类是不能被继承了（密封类）
 final class BaoZi extends  Cat {     //多层继承不能超过3层 继承不可以多重
    public BaoZi (String name) {
        super(name);
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super( name );
    }

    public void fly( ) {

        System.out.println(this.name+"Bird-----------fly( )");
    }
}



public class TestDemo {

    public static void main(String[] args) {
        BaoZi b = new BaoZi( "包子");
        b.eat();
    }

    public static void main2(String[] args) {
        Cat cat = new Cat( "baozi");
        cat.eat(); //baozi 先传给包子的构造器 再通过supper 传给动物的构造器 最后动物的eat方法拿到baozi

    }






    public static void main1(String[] args) {
        Cat cat = new Cat( "baozi");
        cat.name = "包子"; //猫继承了name属性
        cat.eat();          //继承了吃 方法
        //cat.sleep();  /** 如果private修饰的方法 ，是可以被继承的 但是子类中无法访问 */



    }


}
