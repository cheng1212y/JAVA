package com.operation;

import com.book.BookList;

/**
 * @Description:   因为 每个增删查改类都是不同的方法，可以设计一个借口
 * @Author: Cheng
 * @Create: 2020-05-05 21:16
 **/
public interface IOperation {

    //默认抽象方法  让其它增删查改类继承这个接口
     void work (BookList bookList);
}
