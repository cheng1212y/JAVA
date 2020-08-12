import com.book.BookList;
import com.user.Admin;
import com.user.NormalUser;
import com.user.User;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-05-05 20:19
 **/
public class TestMain {

    //提供登录的界面
    public static User login ( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------请输入您的姓名--------");
        String name = scanner.next();
        System.out.println("--------请选择您的身份--------");
        System.out.println("---1、管理员----2、普通用户---");
        int choice = scanner.nextInt();
        if (choice == 1) {

            //通过返回值发生了向上转型 父类User接受   （1直接赋值、2传参、2返回值）
            return new Admin(name);
        }
        else {
            //name若想传过去，必须在三个用用户类中提供构造方法
            //返回的对象不一样 打印的菜单就不一样
            return new NormalUser(name);
        }
    }



    public static void main(String[] args) {

        //1 准备图书 调用不带参数的构造方法 就有了三本书
        BookList bookList = new BookList();

        //2 登录展示的界面
        User  user = login(); //接受返回的两种用户对象(普通用户或者管理员)

        //menu方法 多态的体现；1、父类引用 引用子类对象；2、父类与子类拥有同名的重写方法；3、父类引用调用同名的重写方法

        //每个不同的返回值都是不同的操作 根据选择的调用不同的方法
       while (true) {
           int choice = user.menu();
           user.doOperation(bookList, choice); //user可能是管理员或用户，调用继承的父类doOperation 方法
       }

    }
}
