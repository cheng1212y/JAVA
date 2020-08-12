/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-27 18:33
 **/
public class Test {


    public static void main(String[] args) {
        Child c=new Child();
        //首先自动调用了父类的构造方法 value为100;
        //继续执行Child构造器 ，调用 父类的value属性赋值为200
        Father f = new Father();
        //之后再次调用父类Father的value属性 值仍然为100;
    }
}
class Father{
    int value=100;
    public Father() {
        System.out.println(value);
    }
}
class Child extends Father{
    public Child() {
        value= 300;
        super.value = 200;
    }
}


