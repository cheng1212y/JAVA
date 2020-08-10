/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-25 14:47
 **/
public class Test {

    //第九题
    /**99999999999999999999999999999相交结点*/
    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        //1计算 ps pl的长度
        while ( pl!= null) {
            lenA ++;
            pl = pl.next;
        }

        while ( ps != null) {
            lenB ++;
            ps = ps.next;
        }
        pl = headA;//恢复头结点的位置
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //2 让长的先走|lenA - LenB|步数
        for (int i = 0; i <len; i++) {
            pl = pl.next;
        }
        //3同一起跑线后 一起走
        while (ps != pl && ps !=null && pl != null ) {
            ps = ps.next;
            pl = pl.next;
        }
        //4退出有两种情况 无交点 有交点
        if (pl != null) {
            return pl;
        }
        return null;
    }

    /** 555555555555555555555合并两个有序链表为一个单链表*/
    public Node mergeTwoLists(Node a, Node b) {
        Node newHead = new Node(-1);//生成新链表来串两个
        Node tmp = newHead;
        while (a != null && b!=null) {
            if (a.data <= b.data) {
                tmp.next = a;
                a = a.next;
            }
            else {
                tmp.next =b;
                b = b.next;
            }
            tmp = tmp.next;//新链表的tmp也要每次往后走
        }
        if (a != null) {
            tmp.next =a;

        }
        if (b !=null) {
            tmp.next = b;
        }
        return newHead.next;
    }





    public static void main(String[] args) {
        TestDemo linked = new TestDemo();
/*第六题
        linked.addFirst(12);
        linked.addLast(5);
        linked.addLast(14);
        linked.addLast(2);
        linked.addLast(8);

        linked.display();
        System.out.println();

        Node ret6 =  linked.partition( 12);
        linked.displayHome(ret6);*/

/* //第七题
        linked.addFirst(1);
        linked.addLast(2);
        linked.addLast(3);
        linked.addLast(3);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(5);
        linked.display();
        System.out.println();
        Node ret7 = linked.deleteDuplicates();
        linked.displayHome(ret7);*/

/*
//第八题
        linked.addFirst(0);
        linked.addLast(0);

        System.out.println();
        boolean b = linked.isPalindrome( );
        System.out.println(b);
*/

/*//第十题
        linked.addFirst(1);
        linked.addLast(2);
        linked.addLast(3);
        linked.addLast(3);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(5);
        linked.display();
        System.out.println();
        boolean ret9 = linked.hasCycle();
        System.out.println(ret9);*/

/*
//第十一题
        linked.addFirst(1);
        linked.addLast(2);
        linked.addLast(3);
        linked.addLast(3);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(5);
        linked.display();
        System.out.println();
        Node ret11 =linked.detectCycle ();
        System.out.println(ret11);
*/

/*//第九题
        linked.addLast(1);
        linked.addLast(2);
        linked.addLast(3);
        linked.addLast(4);
        linked.addLast(5);
        linked.addLast(6);
        linked.display();
        System.out.println();
        TestDemo linked2 = new TestDemo();
        linked2.addLast(10);
        linked2.addLast(33);
        linked2.addLast(45);
        linked2.addLast(66);
        linked2.addLast(21);
        linked2.addLast(55);
        linked2.display();
        System.out.println();

         Node ret9 =  getIntersectionNode(  linked.head,linked2.head);
        System.out.println(ret9.data);*/
    }
}