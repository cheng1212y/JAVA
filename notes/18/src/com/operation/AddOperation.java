package com.operation;

import com.book.Book;
import com.book.BookList;

import java.util.Scanner;

/**
 * @Description:  新增图书
 * @Author: Cheng
 * @Create: 2020-05-05 21:07
 **/
public class AddOperation  implements IOperation {  //实现了一个借口

    //work 操作的都是图书顺序表 所以形参是顺序表

    @Override    //重写了接口中操作图书顺序表的work方法
    public void work(BookList bookList) {

        //组装一本书
        System.out.println("新增图书");

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入添加图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入添加图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入添加图书的价格");
        int price =scanner.nextInt();
        System.out.println("请输入添加图书的类型");
        String type = scanner.next(); //nextInt 与nextLine不能连用，改为next

        //生成了一本书
        Book book = new Book(name,author,price,type);

        //向bookList中设置一本书
        int curSize =bookList.getUsedSize();//默认尾插法 原来就有三本书
        bookList.setBooks(curSize,book);
        bookList.setUsedSize( curSize +1);//图书数目加一
        System.out.println("添加成功！");

    }
}
