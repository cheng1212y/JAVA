import java.util.Scanner;

/**
 * @Description: 认识异常
 * @Author: Cheng
 * @Create: 2020-05-12 13:42
 **/
class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
/** 受查异常，必须在运行之前就将它查理 否则代码将不能跑 */
public class Test {

    public static void main(String[] args) {
        Person person1 =new Person();
        try {
            Person person2 =(Person) person1.clone(); //受查异常 需要try catch包裹起来
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    /** finally注意事项*/
    public static void main7(String[] args) {
        System.out.println(func33());
    }
    public static int func33() {
        try {
            return 10;
        } finally {
            return 20;  //最终会被执行
        }
    }


    /** 为了让方法的调用者知道会抛出异常，需要声明一个异常*/
    public static void main6(String[] args) {
        try {
            int ret = divide( 20,0);
            System.out.println(ret);
        }
        catch ( ArithmeticException e ) {
            e.printStackTrace();
            System.out.println("aaaa");
        }
        System.out.println("继续执行");
    }
    private static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("y==0");
        }
                return x/y;
    }


    /** 被调用的函数没有处理异常； 那么将来谁调用谁处理*/
    public static void main5(String[] args) {
        try {
            func1();//如果向上一直传递都没有合适的方法处理异常, 最终就会交给 JVM 处理, 程序就会异常终止
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    public static void func1() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);  //被调用的函数没有处理异常； 那么将来谁调用谁处理
    }


    /** 使用 try 负责回收资源*/
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println(10/n);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            scanner.close();  //一定被执行 就回收了
        }

    }
    /** finally中的永远会被执行*/
    public static void main3(String[] args) {
        System.out.println(func());
    }
    public static int  func ( ) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
            return 1;                       //抛出异常 就不会执行下面的了
        }catch ( ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了空数组越界异常");
            return 2;              // 不会返回2 因为有finally语句 它永远会被执行
        }finally {
            return 3; //永远被执行 但是不建议在这些return语句
        }
    }


    public static void main2(String[] args) {

        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
            System.out.println("不会被执行！");
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }catch ( ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了空数组越界异常");
        }finally {
            System.out.println("finally块的代码肯定会被执行！，" +   //Finally 始终会被执行
                    "所以经常做一些善后工作，比如关闭资源");
        }
        System.out.println("hello");
    }



    public static void main1(String[] args) {
//        int [] arr = {1,2,3};
//        arr [4] = 0;
//        System.out.println("hello");

        //处理异常的方式 try catch
        int [] arr = {1,2,3};
        try {
            arr [4] = 0;
        }
        catch ( ArrayIndexOutOfBoundsException e ) { //e是随便给的一个参数
           e.printStackTrace();                        //打印调用栈的追踪信息
            System.out.println("捕获到了异常");
        }
        System.out.println("hello");
    }
}
