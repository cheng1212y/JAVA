/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-20 19:56
 **/

public class Test {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(3);
        myLinkedList.addLast(7);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(8);
        myLinkedList.addLast(6);
        myLinkedList.display();
        myLinkedList.remove(6);
            System.out.println();

        myLinkedList.display();
        System.out.println( );
//        myLinkedList.remove(1212);
//        System.out.println();
//        myLinkedList.display();


//        myLinkedList.addIndex(0,0);
//        myLinkedList.addIndex(5,0);

//        boolean f = myLinkedList.contains(88);
//        boolean g = myLinkedList.contains(3431);
      //  int a = myLinkedList.size();
//        System.out.println(f);
//        System.out.println(g);
   //     System.out.println("长调度"+a);
  //      myLinkedList.display();
    }



}















//public class Test {
//    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addFirst(1);
//        myLinkedList.addFirst(12);
//        myLinkedList.addFirst(13);
//   myLinkedList.addLast(666);
//   myLinkedList.display();
//   boolean f = myLinkedList.contains(666);
//        System.out.println(f);
//        System.out.println(myLinkedList.size());
//
//        myLinkedList.addIndex ( 2,121212);
//
//
//
//
//        myLinkedList.display();
//    }
//}
