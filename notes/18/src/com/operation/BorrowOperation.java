package com.operation;

import com.book.Book;
import com.book.BookList;

import java.util.Scanner;

/**
 * @Description: 借出图书
 * @Author: Cheng
 * @Create: 2020-05-05 21:11
 **/
public class BorrowOperation  implements IOperation {

    //work 操作的都是图书顺序表 所以形参是顺序表
    @Override
    public void work (BookList bookList) {

        System.out.println("借阅图书");


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入借阅图书的名字");
        String name = scanner.nextLine();

        for (int i = 0; i <bookList.getUsedSize() ; i++) {
                //遍历一下顺序表 看看有没有这本书
             Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                //可以借阅
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("这本书不存在！！！");
    }
}
