
/**
 * @Description:    有关构造方法 与 this ，代码块  。    alt insert 自动生成
 * @Author: Cheng
 * @Create: 2020-04-18 14:52
 **/


 /**       构造方法是一种特殊方法, 使用关键字new实例化新对象时会被自动调用, 用于完成初始化操作.
        new 执行过程
        为对象分配内存空间
        调用对象的构造方法
        语法规则
        1.方法名称必须与类名称相同
        2.构造方法没有返回值类型声明
        3.每一个类中一定至少存在一个构造方法（没有明确定义，则系统自动生成一个无参构造）
                 注意事项
                 如果类中没有提供任何的构造函数，那么编译器会默认生成一个不带有参数的构造函数
                若类中定义了构造方法，则默认的无参构造将不再生成.
                构造方法支持重载. 规则和普通方法的重载一致.
*/




class Person {
    private String name ;
    private  int age ;
    private static int count ;

/**  执行顺序： 静态代码块       且静态代码块只会被执行一次
 *               实例代码块
 *               构造函数
 *                              静态代码块与静态成员变量执行顺序是，谁在前直系执行谁
   */
    //------------实例代码块--------------   一般用于初始化实例成员变量。
     {
         this.name ="xatu";               //-------------可以访问实例成员变量
         count = 99;                      //------------可以设置静态成员变量值
         System.out.println("-----实例代码块----");

     }

     //--------------静态代码块--------------  一般用于初始化静态成员属性。
    static {
       //  this.name  = "baozi";  -------------------错误 ，不能访问非静态的数据成员
         count =999;
        System.out.println("----静态代码块--------");
    }


    public Person ()  { //-------------------------这是一个构造方法：方法名和类名相同,无返回值。

       this( "baozi",1);//-----------------this 调用自己的构造方法，传参进去
                                        //----------this限制只能在构造方法里面使用
        //this("zhangfei");---------------------------只能调用一个this
        System.out.println("Person <init>");
    }



     public Person (String name , int age ) { //----------------构造方法把属性传进来，相比get 与set也可以，且更加灵活
    this.name = name;
    this.age = age;

        System.out.println("Person<String,int>");
    }

    private    static void sleep ( ) {
        System.out.println("xix");
    }
    public void eat () {

        System.out.println(this.getName()); //------------this调用当前对象的方法
        System.out.println(this.age);//-------------------this调用当前对象的属性

    }



     public  Person (String name  ) { //-----------构造方法是可以自己写的
         this.name = name ;
     }





         public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




public class Test {


    public static void main3(String[] args) {
        Person person1 = new Person();
        person1.eat();
        person1.eat();                           //new一次 可以多次使用
        System.out.println(person1.getName());

        new Person().eat();  //---------------匿名对象  每次只能使用一次
        new Person().eat(); //------------想调用 还要继续new一个对象
        new Person().getName();    //---------没有引用的对象称为匿名对象.
                                // ---------  匿名对象只能在创建对象时使用.
                             //---------------如果一个对象只是用一次, 后面不需要用了, 可以考虑使用匿名对象

    }




//-------------构造方法----------------
    public static void main2(String[] args) {
        Person per1 = new Person();  //----------首先调用不带参数的构造方法
        System.out.println(per1);    //---------不带参数的构造方法内部通过this调用自己的构造方法，最后打印
        Person per2 = new Person("xx",12);
        System.out.println(per2);


    }




    public static void main1(String[] args) {

        Person per1 = new Person();  //----------实例化一个对象。通过构造方法，分两步，1为对象分配内存，2调用合适的构造方法
                                    //可以调用 构造的方法 Person( )
                                    //当没有提供构造方法的时候，编译器会自动提供一个不带参数的构造方法，如果自己提供了构造方法，编译器就不自动生成了 这行会报错
        System.out.println(per1);

       Person per2 = new Person("cat",19);//--------表示构造对象的时候，调用了带有两个参数的构造方法
       per2.setName("baozi");  //---------------看不惯构造方法赋的初值，依然可以通过set方法修改
        System.out.println(per2);


    }

}
