/**
 * @Description:   自定义异常
 * @Author: Cheng
 * @Create: 2020-05-12 19:13
 **/

/**
 * 1、自定义异常通常会继承自 Exception 或者 RuntimeException
   2、继承自 Exception 的异常默认是受查异常--------------受查异常try catch包裹
   3、继承自 RuntimeException 的异常默认是非受查异常.
 * */
class MyException extends RuntimeException {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
public class Test2 {
    private static void func(int x) throws MyException{
        if(x == 10) {
            throw new MyException("x==10");  //自己写的异常类必须继承一个父类
        }
    }
    public static void main(String[] args) {
        try {
            func(10);
        }catch (MyException e) {
            e.printStackTrace();
        }
    }
}