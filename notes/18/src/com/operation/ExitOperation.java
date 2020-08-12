package com.operation;

import com.book.BookList;

/**
 * @Description: 退出系统
 * @Author: Cheng
 * @Create: 2020-05-05 21:13
 **/
public class ExitOperation  implements IOperation {

    //work 操作的都是图书顺序表 所以形参是顺序表
    @Override
    public void work (BookList bookList) {

        System.out.println("退出系统");
        System.exit(1); //正常退出
    }
}
