/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-26 22:32
 **/
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(24);
        myLinkedList.addFirst(24);
        myLinkedList.addFirst(232);
        myLinkedList.addFirst(24);
        myLinkedList.addFirst(24);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(232);
        myLinkedList.display();

/*
        myLinkedList.display();
        System.out.println();
       myLinkedList.clear();
        System.out.println();
        myLinkedList.addLast(22);
        myLinkedList.display();*/

        /*boolean r = myLinkedList.contains(122);
        int a =  myLinkedList.size();
        System.out.print(r);
        System.out.println(a);*/

    }
}
