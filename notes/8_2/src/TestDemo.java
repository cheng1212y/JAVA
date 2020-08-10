/**
 * @Description:  类的封装  用private 修饰属性或者方法
 * @Author: Cheng
 * @Create: 2020-04-17 18:46
 **/
//为什么要封装？？？？
//     代码导致类的使用者(main方法的代码)必须要了解 Student 类内部的实现, 才能够使用这个类. 学习成本较高
//    一旦类的实现者修改了代码(例如把 name 改成 myName), 那么类的使用者就需要大规模的修改自己的代码, 维护成本较高


    //------------this  当前对象的引用



    // alt + insert  可以自动生成 getter 与setter

class  Student {

    //限定你只能在类当中进行访问
    private String myName ;   //----------如果一个属性或者方法被private修饰，就只能在类当中使用
    private int age;//---------无特殊要求 所以的属性都设置为私有的



    public void setMyName ( String myName) {  //-------------提供一个公开的接口让外部设置 被private修饰的MyName

//       MyName = MyName;-------------------错误，其实就是 自己给自己赋值  并没有赋值属性  局部变量优先，形参
        this.myName = myName;  //---------- 正确this引用，表示调用该方法的对象
    }                                       //或者当前对象的引用

    public String getMyName ( ) {//-------------提供一个公开的接口让外部获取 被private修饰的MyName
        return this.myName;
    }


    public  void  func1 () {
        System.out.println("func1 ( )");
    }

    public void show() {
        System.out.println("我叫" + this.myName + ", 今年" + this.age + "岁");  //----------被private修饰 ，类内是可以访问的
    }

    //重新 实现了一下 Object类的 toString()方法
    //Object  是 所有类的父类  alt + insert  ->toString()

//    @Override     //注解：这个注解指的是  这个方法是重新写的
//    public String toString() { //  -------------可自动生成
//        return "Student{" +
//                "myName='" + myName + '\'' +
//                ", age=" + age +
//                '}';
 //   }
}


public class TestDemo {
    public static void main(String[] args) {
        Student student  = new Student();
    //  student.MyName= "baozi"； --------------------不可以被访问,只能在类中访问 private修饰了


        student.setMyName("baozi"); //-----------使用public接口设置被private修饰的成员变量    public接口不会被轻易修改，一般较稳定

        String str = student.getMyName();    //-----------public提供了接口 获取private成员变量的值
        System.out.println(str);
        student.show();    //-----------------成员变量修改后 看一下 show一下 看

   //    System.out.println(student);//  自动打印 alt+ insert 选toString

    }
}
