/**
 * @Description:    static 关键字  修饰成员变量与成员方法
 *
 * 静态方法属于类，而不属于类的对象。静态方法和实例无关, 而是和类相关.
 * 可以直接调用静态方法，而无需创建类的实例。
 * 静态方法可以访问静态数据成员，并可以更改静态数据成员的值
 *
 *
 * 静态方法和实例无关, 而是和类相关. 因此这导致了两个情况:
 * 静态方法不能直接使用非静态数据成员或调用非静态方法(非静态数据成员和方法都是和实例相关的).
 * this和super两个关键字不能在静态上下文中使用(this 是当前实例的引用, super是当前实例父类实例的引用，也是和当前实例相关).
 *
 * @Author: Cheng
 * @Create: 2020-04-17 16:37
 **/
class  Person {
    //字段->成员变量   定义在方法外边  类 的 里面
    // 实例成员变量：对象里面
    //实例成员没有初始化 默认值为对应的0值。引用类型默认为null   简单类型默认为0
    //char ->'\u0000'    boolean -> false
    public String name ;//------------这是一个****实例成员变量*****  ，它的位置在对象上，对象是在堆上的。
    public int age;     // 一般我们不赋初始值，要赋也可以 public int age=18;
    //一般加public 最好加private



    public static int size ;//----------这是一个****静态成员变量***，它在方法区上，且只有一份。
    //---------静态成员变量 不属于对象  它属于类。   和实例成员变量一样未初始化时候值是  0
   //-------被static所修饰，所有类共享。且不属于对象


    public final int SIZE = 10;//------------被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public static final int COUNT = 99;//---------静态的常量，属于类本身，只有一份 被final修饰，后续不可更改




    //方法->行为   实例成员方法
    public void eat ( ) {
        int a = 0; //--------------------这是一个局部变量，局部变量要初始化（方法里的都是局部变量）
        System.out.println("eat!");
    }
    public void sleep ( ){

        //func1();-----------------   实例可以调用静态
        System.out.println("sleep");
    }


    public  static  void func1() {   //-----------这是一个静态的成员方法，属于类，而不属于类的对象

       // sleep();--------------静态也不能调用实例

        //  name= 99; ------------------静态不能修改实例的
        size=999;  //   ----------------- 静态方法只能修改静态成员变量，内部不能访问非静态的数据


        System.out.println("static: func1( )"+size);
    }
}





public class Test {
    public static void main(String[] args) {
        System.out.println(Person.size);
        Person.func1();
        System.out.println(Person.size);
    }
}
