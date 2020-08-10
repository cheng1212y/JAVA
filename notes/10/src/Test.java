import java.util.Arrays;

/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-19 14:31
 **/

public class Test {
//
public static void main(String[] args) {
    MyArrayList myArrayList = new MyArrayList(); // 实例化一个顺序表

    for (int i = 0; i <10 ; i++) {

        myArrayList.add(i,i);  //-----------增 插入元素
    }

    myArrayList.display( );
    System.out.println();
    myArrayList.add(10,324);
    myArrayList.display();
  // myArrayList.remove(6);  //---------------删出一个元素
  // myArrayList.display( );   //-----------打印元素

   // myArrayList.setPos(2,999); //------------改 修改2号下标为999
  //  myArrayList.display( );

//    System.out.println();
//    myArrayList.add(10,1111); //-----满了会扩容
//    myArrayList.display( );
//    System.out.println();
//    System.out.println(myArrayList.contains(1111111)); //----查找是否包含一个元素
//    System.out.println();
//    System.out.println(myArrayList.search(6)); //----查给元素求下标
//    System.out.println();
//    System.out.println(myArrayList.getPos(10));       //-----查 给下标求元素
//    System.out.println();
//    System.out.println(myArrayList.size());           //-----获取顺序表的长度
//
//
//    myArrayList.clear();                           //----------清空顺序表





}












//    public int[] elem;//数组
//    public int usedSize;//有效的数据个数
//    public static final int intCapacity = 10;//初始容量
//
//    public Test() {
//        this.elem = new int[intCapacity];
//        this.usedSize = 0;
//    }
//
//    //---------------------add----------------------
//    public void add(int pos, int data) {
//        if (pos > 0 && pos < this.usedSize) {
//            for (int i = this.usedSize - 1; i >= pos; i--) {
//                elem[i + 1] = elem[i];
//            }
//            this.elem[pos] = data;
//        }
//
//    }
//
//    //-----------------打印顺序表-----------------------
//    public void display() {
//        for (int i = 0; i < this.usedSize; i++) {
//
//            System.out.println(this.elem[i]);
//        }
//    }
//
//    //--------------是否包含一个元素--------------------
//
//    public boolean contains ( int toFind) {
//        for (int i = 0; i < this.usedSize; i++) {
//            if (this.elem[i]==toFind) {
//                return true;
//            }
//        }
//        return false;
//    }
////----------------是否有这个元素 有就返回下标-------------------
//    public int search (int toFind) {
//        for (int i = 0; i <this.usedSize ; i++) {
//            if (this.elem[i]==toFind){
//                return i;
//            }
//        }
//        return -1;
//    }
////-----------------------获取pos位置的元素-----------------
//    public int getPos ( int pos ) {
//        if ( this.usedSize==0 || pos < 0 || pos >= this.usedSize  ){
//            return -1;
//        }
//        return this.elem[pos];
//        }
//
//    //-------------
//
////----------------------删除第一次出现的关键字toRemove----------
//
//        public void remove ( int toRemove) {
//        int index = 0;
//            for (int i = 0; i <this.usedSize ; i++) {
//                if (this.elem[i] == toRemove) {
//                    index = i;
//                }
//            }
//            for (int j = index; j <this.usedSize-1 ; j++) {
//                this.elem[j]=this.elem[j+1];
//            }
//
//            this.usedSize--;
//
//
//
//        }
//
//
//}




}








