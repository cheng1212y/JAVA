package com.book;

/**
 * @Description: 用来保存 N 本书
 * @Author: Cheng
 * @Create: 2020-05-05 20:39
 **/
public class BookList {

    private Book [ ] books = new Book[100];
    private int usedSize = 0;


    //构造方法------------使得程序一运行就有三本书
    public BookList( ) {
        books [0] = new Book("Java核心技术","昊斯特曼、Gary Cornell",199,"工具书" );
        books [1] = new Book("史记","司马迁",299,"历史书" );
        books [2] = new Book("变形记","卡夫卡",78,"外国文学");
        this.usedSize = 3;
    }



    //图书放入
    public void setBooks (int pos ,Book book) {
        this.books [pos] = book;
    }

    public Book getBooks ( int pos) {
        return this.books[pos];
    }


    //usedSize的 get set方法
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
