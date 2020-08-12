package com.operation;

import com.book.Book;
import com.book.BookList;

/**
 * @Description: 显示图书
 * @Author: Cheng
 * @Create: 2020-05-05 21:12
 **/
public class DisplayOperation implements IOperation {

    //work 操作的都是图书顺序表 所以形参是顺序表
    @Override
    public void work (BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
