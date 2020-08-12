package com.operation;

import com.book.Book;
import com.book.BookList;

import java.util.Scanner;

/**
 * @Description: 删除图书
 * @Author: Cheng
 * @Create: 2020-05-05 21:12
 **/
public class DelOperation  implements IOperation {

    //work 操作的都是图书顺序表 所以形参是顺序表
    @Override
    public void work (BookList bookList) {

        System.out.println("删除图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字");
        String name = scanner.nextLine();

        int i = 0;
        for (i = 0; i <bookList.getUsedSize() ; i++) {
            //遍历一下顺序表 看看有没有这本书
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        //1、for退出；
        if ( i == bookList.getUsedSize()) {
            System.out.println("不存在这本书！！！");
            return;
        }

        //2、找到了退出        删除图书
        for (int pos = i; pos < bookList.getUsedSize()-1; pos++) {
            //bookList[pos] = bookList [ pos +1 ]; 错误写法
            Book book = bookList.getBooks(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功");
    }
}
