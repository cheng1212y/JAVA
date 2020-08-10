/**
 * @Description:    如何访问实例成员方法 与静态成员方法
 * @Author: Cheng
 * @Create: 2020-04-17 16:13
 **/
class  Person {
    //字段->成员变量   定义在方法外边  类 的 里面
    // 实例成员变量：对象里面
    //实例成员没有初始化 默认值为对应的0值。引用类型默认为null   简单类型默认为0
    //char ->'\u0000'    boolean -> false
    public String name="cheng" ;//------------这是一个****实例成员变量*****  ，它的位置在对象上，对象是在堆上的。
    public int age=18;     // 一般我们不赋初始值，要赋也可以 public int age=18;
    //一般加public 最好加private



    public static int size ;//----------这是一个****静态成员变量***，它在方法区上，且只有一份。
    //---------静态成员变量 不属于对象  它属于类。   和实例成员变量一样未初始化时候值是  0
  //---被static所修饰，所有类共享。且不属于对象


    public final int SIZE = 10;//------------被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public static final int COUNT = 99;//---------静态的常量，属于类本身，只有一份 被final修饰，后续不可更改






    //方法->行为   实例成员方法
    public void eat ( ) {
        int a = 0; //--------------------这是一个局部变量，局部变量要初始化（方法里的都是局部变量）
        System.out.println("eat!");
    }

    public void sleep ( ){

        System.out.println("sleep");
    }


    public void show() {
  System.out.println("我叫" + name + ", 今年" + age + "岁");
    }



    public  static  void func1() {   //-----------这是一个静态的成员方法，属于类，不属于对象


        System.out.println("static: func1( )");
    }
}




public class Test {
    public static void main(String[] args) {
     Person per = new Person();
     per.eat();     //----------------通过对象的引用per来访问实例方法，方法不属于对象，方法中的局部变量依然在栈中
     per.sleep();


     per.show();// ----------直接调用 name age都被初始过





        per.name="包子";
        per.age=1;//-------实例方法成员变量 修改后调用实例方法
        per.show();






     Person.func1();// -------------静态的方法直接用类名调用



    }
}
