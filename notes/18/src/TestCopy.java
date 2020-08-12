/**
 * @Description: Cloneable 方法的深浅拷贝
 * @Author: Cheng
 * @Create: 2020-05-03 15:52
 *
 *
 * 自定义类型clone
 * 1、实现接口 Cloneable
 * 2、重写clone方法
 **/


class Money implements Cloneable{  /** money 实现clone接口 从而引用类型实现深拷贝*/

    double money =12.5;
    @Override
    protected Object clone() throws CloneNotSupportedException { /**重写clone方法*/
        return super.clone();
    }
}


 /** 2 money引用类型浅拷贝时候*/
//class Money {

//    double money =12.5;
//}

class Person  implements Cloneable{  //需要实现 克隆的接口
    public int age ;

    Money m = new Money();  //Person 当中有一个m指向money对象
                                //new了一下不在对象里面在堆上， 对象里面放的是变量m的地址
    @Override                       /** clone方法声明了一个异常 ---> 需要处理*/
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); 引用类型浅拷贝的时候

        /**---------------引用类型的深拷贝-------------------------------------*/
        Person p = (Person) super.clone();         /** 1、当前person进行克隆*/
         p.m = (Money) this.m.clone();/** 2、当前money进行克隆  并且将它赋给新person的 m  */
         return p;  /** 3、返回的p给了person2*/

    }
}
public class TestCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
                Person person1 = new Person();
                Person person2 = (Person )person1.clone();
                System.out.println(person1.m.money);
                System.out.println(person2.m.money);

                System.out.println("--------修改后----------");
                person2.m.money = 99.9;
                System.out.println(person1.m.money);
                System.out.println(person2.m.money);


    }









/**--------------------简单类型的深拷贝-------------------------------------*/
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person )person1.clone();//因为clone方法的返回值是Object 所有要强制转为Person
        System.out.println(person1.age); //0
        System.out.println(person2.age);//0

        person2.age =99;
        System.out.println("--------修改后----------");
        System.out.println(person1.age);//0
        System.out.println(person2.age);//99


    }
}
