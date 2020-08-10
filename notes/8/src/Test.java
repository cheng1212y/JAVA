/**
 * @Description:    类的定义与 成员变量的访问方法
 * @Author: Cheng
 * @Create: 2020-04-16 19:19
 **/
//
//访问修饰限定符：
//public:  公有的
//private   私有的
//protected：受保护的
//        什么都不写：默认权限-》包访问权限

class  Person {
    //字段->成员变量   定义在方法外边  类 的 里面
    // 实例成员变量：对象里面
    //实例成员没有初始化 默认值为对应的0值。引用类型默认为null   简单类型默认为0
    //char ->'\u0000'    boolean -> false
    public String name ;//------------这是一个****实例成员变量*****  ，它的位置在对象上，对象是在堆上的。
    public int age;     // 一般我们不赋初始值，要赋也可以 public int age=18;
    //一般加public 最好加private


    public static double q ;



    public static int size ;//----------这是一个****静态成员变量***，它在方法区上，且只有一份。
                            //---------静态成员变量 不属于对象  它属于类。   和实例成员变量一样未初始化时候值是  0
//----被static所修饰，所有类共享。且不属于对象



    public final int SIZE = 10;//------------被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public static final int COUNT = 99;//---------静态的常量，属于类本身，只有一份 被final修饰，后续不可更改


    //方法->行为   实例成员方法
    public void eat ( ) {
        int a = 1110; //--------------------这是一个局部变量，局部变量要初始化（方法里的都是局部变量）
        System.out.println("eat!");
    }
    public void sleep ( ){

        System.out.println("sleep");
    }
}


public class Test {

    public static void main(String[] args) {
        Person per = new Person(); //--------这是实例化对象 通过new， new的对象在堆上，引用per是在栈上
        System.out.println(per.age);//-------------如何访问对象当中的 实例成员变量 ？-----------对象的引用.成员变量

        System.out.println( Person.size);//--------------如何访问静态成员变量？？-------------类名.静态成员变量
                                        //--------------静态成员变量在方法区上


        System.out.println(Person.q);
    }
}
