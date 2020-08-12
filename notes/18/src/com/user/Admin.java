package com.user;

import com.operation.*;

import java.util.Scanner;

/**
 * @Description:    管理员用户
 * @Author: Cheng
 * @Create: 2020-05-05 21:31
 **/
public class Admin extends User {   //继承了父类User 拿过来了name


    public Admin(String name) {
        super(name);

        //当new一个管理员时候，直接将操作已经初始化好了
        this.operations = new IOperation[ ] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(), //都拥有一个work方法，操作的是booklist顺序表
                new DelOperation(),
                new DisplayOperation()
        };

    }

    //重写父类的菜单抽象方法
    @Override
    public int menu() {
        System.out.println("*****************************");
        System.out.println("*"  +this.name+"您好，欢迎来到图书馆   *");
        System.out.println("*        请选择您的操作     *");
        System.out.println("*        1、查找图书        *");
        System.out.println("*        2、新增图书        *");
        System.out.println("*        3、删除图书        *");
        System.out.println("*        4、显示图书        *");
        System.out.println("*        0、退出系统        *");
        System.out.println("*****************************");

        Scanner scanner = new Scanner( System.in);
        int choice = scanner.nextInt();
        //通过输入的数字 调用增删查改方法
        return choice ;
    }
}
