package com.user;

import com.book.BookList;
import com.operation.IOperation;

/**
 * @Description:   User类设计为 普通用户  和  管理员用户的 父类，供他们继承
 * @Author: Cheng
 * @Create: 2020-05-05 21:29
 **/
public abstract class User {
    protected String name;

    //将管理员和普通用户操作存起来放在接口类型数组 IOperation中
    protected IOperation [] operations;

    public User(String name) {  //供子类传过来的name
        this.name = name;
    }

    //因为普通用户与管理员用户都需要打印菜单，所以设计为一个抽象方法，供他们继承
    //此处的 menu方法体现了多态
    public abstract int menu ( );

    //对应操作的方法,根据你的选择 在数组中去找对应的增删方法
    public void doOperation(BookList bookList,int choice ) {

        //代表数组中 对应下标的操作
        this.operations [ choice ].work( bookList );

    }

}
