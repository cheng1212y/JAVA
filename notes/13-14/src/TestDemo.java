
/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-04-25 14:47
 **/

    class Node {       // Node是自己定义的一种类型  节点类型

        public int  data ;   //数据
        public Node next;   //next保存的是下一个节点的地址 所以next的类型就应该是Node

        public Node(int data) {    //提供构造方法 可以按照Node类来按模型制造节点
            this.data = data;
            this.next = null;
        }
    }


    public class TestDemo {

        public Node head;               // head类型也是一个Node类型 ， head也是一个引用 ，用来保存头结点的地址
        //代表整个单链表一长串的头 不是某个结点的头，保存单链表头结点的引用，head只是表示当前暂时头在那 有可能删掉
        /**------------------头插法-----------------------*/
        public void addFirst(int data) {
            Node node = new Node( data); //给构造方法传参数data，按照模板生成一个结点 数据域为data next域为null
            if (this.head == null) {     //首先判断是不是第一次插入 ，第一次插入的时候 head是 null的 因为head是实例成员变量未初始化
                this.head = node;       //直接将node的地址给head   this访问当前对象的属性 成员方法 构造方法，node什么都不算不加
                return;
            }
            node.next = this.head ;   //不是第一次插入   插入的时候首先把绑定后面的结点帮到前面
            this.head = node;         //node绑到head上
        }
        /**--------------打印链表---------------------------*/
        public void display ( ) {
            Node cur = this.head;                 //创建一个cur指向head结点，直接用head循环结束后 head值会一直往后移，导致头结点改变
            while ( cur != null ) {              //此处判断 cur的值是否为空   cur.next不会遍历到最后一个元素
                System.out.print(cur.data+ " ");
                cur = cur.next;                  // cur是一个对象，要访问它的属性，使用它的引用，自增条件是 cur的值为下一个cur的引用
            }

        }
        /**-------------尾插法-------------------------*/
        public void addLast ( int data ) {
            Node node = new Node(data);     //给构造方法传参数data，按照模板生成一个结点 数据域为data next域为null
            if(this.head == null) {         //首先判断是不是第一次插入 ，第一次插入的时候 head是 null的 因为head是实例成员变量未初始化
                this.head=node;               //直接将node的地址给head
                return;
            }
            Node cur = this.head;          //创建一个cur指向head结点,直接用head循环结束后 head值会一直往后移，导致头结点改变
            while (cur.next != null) {     /** cur.next！=null 要找到最后一个结点的cur的位置*/
                cur = cur.next;            //每次往后挪一个
            }
            cur.next =node;                 //node绑到最后一个结点上
        }
        /**-----------------查找是否包含key----------*/

        public boolean contains(int key) {
            Node cur = this.head;        //创建一个cur指向head结点,直接用head循环结束后 head值会一直往后移，导致头结点改变
            while (cur != null) {        // cur ！= null遍历完链表
                if (cur.data == key) {
                    return true;
                }
                cur = cur.next;        //每次往后挪一个
            }
            return false;
        }
        /**------------得到单链表的长度-------------*/
        public int size() {
            int count = 0;
            Node cur = this.head;    //创建一个cur指向head结点,直接用head循环结束后 head值会一直往后移，导致头结点改变
            while (cur != null) {   //  cur ！= null遍历完链表
                count++;
                cur = cur.next;
            }
            return count ;
        }

        /**-----------寻找index位置的前一个地址-------*/
        private Node searchIndex ( int index ){  //Node 返回的是一个地址。   只提供给 addIndex的 所以private
            if (index < 0 || index > this.size()){  // 判断 index合法性 5个元素 起始0 结束4  5号是可以插的，>5不行没有前驱
                throw new RuntimeException("index位置不合法");
            }
            Node cur = this.head;
            while (index-1 != 0) {  // 0--4 插入3 号位子 cur从开始 走1 2 两步
                cur = cur.next;
                index--;
            }
            return cur;
        }
        /**---------------中间插----------------*/
        public void addIndex(int index,int data) {
            Node node = new Node(data);
            if (index == 0) {                 // 0号插 直接是头插
                addFirst(data);
                return;
            }
            if (index == this.size()) {    // 0---5  5号位子插 就是尾插
                addLast(data);
                return;
            }
            Node cur = searchIndex(index);  //找到了index-1位置的地址
            node.next = cur.next;            //后面绑新的
            cur.next = node;                //新的绑前面
        }


        /**------------判断key元素的前一个地址------------*/
        private Node searchPrev  ( int key ) {
            Node prev = this.head;
            while ( prev.next != null) {    /**若是 prev 走到最后一个 prev.next.data 空指针异常 ;一定是 prev.next !=null   这时候最后结点的data已经被验证了  */
                if (prev.next.data == key ) {
                    return prev;                        // 如果每次prev的下一个结点的 data等于 就返回key的前一个结点 prev
                }
                else {
                    prev = prev.next;                      // 找不到相等 每次prev就往后走一步
                }
            }
            return null;                        //所以的走完了 也没有找到相等的就返回null
        }
        /**----------删除第一次出现的key-------*/
        public void remove ( int key ) {

            if(this.head == null ) {   //顺序表为空
                return;
            }
            if (this.head.data == key ) {
                this.head = this.head.next;        //要删除的元素正好是第一个 在头结点的位置
                return;
            }
            Node prev =  searchPrev  ( key );       //prev结点是删除元素的上一个结点 prev最多走到倒数第二个位置
            if ( prev == null ) {
                System.out.println("没有这个结点");
                return;                       //找不到这个 元素 链表里面没有
            }
            Node del = prev.next;        // 创建一个del结点  代表删除的结点
            prev.next = del.next;    //相当于跳过del结点 舍弃它 链接到下一个; 若删除的是最后一个元素 del的next刚好为null
        }
        /**------------------  删除出现的多个key--------------- */

        public  void  removeAll (int key ) {
            Node prev = this.head;              //prev 总是在cur的前一个相邻位置
            Node cur = this.head.next;
            while (cur != null ) {          //遍历完整个链表
                if (cur.data == key ) {
                    prev.next = cur.next;
                    cur =cur.next;                /** 删除完一个要往后挪一个位置 ，方便下次判断cur是不是和key想到 解决了连续key的问题*/
                }
                else {
                    prev = cur;                 //每次key和cur不相等 prev和cur就依次往后走一个位置
                    cur =cur.next;
                }
            }
            if (this.head.data == key ) {
                this.head = this.head.next;        //要删除的元素正好是第一个 在头结点的位置
            }
        }


        /**--------------清空链表 释放内存------------*/
        public void clear ( ) {
            this.head = null;      //jvm在回收内存时候 当没有人引用这个对象 这个对象才会被回收
        }










        /**           课后习题作业            */

        public void displayHome (Node node ) {
            Node cur = node;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }

        /**22222222222222222222222222222翻转一个链表*/
        public Node removeElements( ) {
            Node prev = null;
            Node tmp = null;
            Node cur  = this.head;
            while (cur != null) {

                tmp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = tmp;
            }
            return prev;
        }

        /**3333333333333333333333寻找中间结点 */

        public Node middleNode(  ) {
            Node fast = this.head;
            Node slow = this.head;
            while ( fast != null && fast.next != null  ) {  //1234  四个结点 第二步fast为空 先判断fast.next会空指针异常 所以写后面
                slow = slow.next;
                fast = fast.next.next;      //快指针时慢的二倍 到达条件为null时候 slow刚刚好走到中间位置
            }
            return slow;
        }

/**44444444444444444444444444找到 倒数第k个结点*/
        /**解法一*/    /*   public Node getKthFromEnd( int k) {
           if (this.head == null ) {
               return null;                   //有可能 链表为空
           }
            if ( k <= 0 || k > size()) {
                return null;                    //k的合法性
            }
            Node slow = this.head;
            Node fast = this.head;
            while ( k-1 > 0 ) {
                fast = fast.next;
                k--;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }*/
        /**解法 二  遍历一次*/
        public Node getKthFromEnd( int k) {
            if (this.head == null ) {
                return null;                   //有可能 链表为空
            }
            if ( k <= 0 /**|| k > size()*/) {    //优化
                return null;                    //k的合法性
            }
            Node slow = this.head;
            Node fast = this.head;
            while ( k-1 > 0 ) {
                if (fast.next != null ) {    /**  此处判断fast的合法就是判断 k的合法性*/
                    fast = fast.next;
                    k--;
                }
                else {
                    System.out.println("k值不合法");
                    return null;
                }

            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

/**66666666666666666链表被x分为两部分小于在前面 大于在后面 不用排序 */
        public Node partition( int x ) {
            Node bs  = null;        //分别是两条虚拟的线 串起结点
            Node be  = null;
            Node as  = null;
            Node ae  = null;
            Node cur = this.head;
            while ( cur != null ) {

                if ( cur.data < x ) { //第一次插入用头插法

                    if ( bs == null ) {
                        bs = cur;
                        be = cur ;
                    }
                    else {              //尾插法
                        be.next = cur;
                        be  = be.next;
                    }
                }
                else {
                    if ( as == null) {   //第一次插入用头插法
                        as = cur;
                        ae = cur;
                    }
                    else {                //尾插法
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            //此时已经串成了一串
            //  1.判断bs是否为空  如果bs == null 返回as
            if ( bs == null ) {
                return as;
            }
            //2、如果bs不为空  需要进行拼接
            be.next = as;
            //3、如果ae不为空    ae的next需要置为空
            if (ae != null) {
                ae.next = null;     //因为ae的最后一个结点 可能next域不为空
            }
            return bs;
        }

/**777777777777777777777777777删除重复的结点  重复的保留一个*/
        public Node deleteDuplicates( ) { //1 2 2 2 3
            Node newHead = new Node(-1);
            Node tmp = newHead;             //tmp 是一直往后走 而 让newHead 保持不动
            Node cur = this.head;
            while ( cur != null)
            //1 有重复结点时候 就跳过
            if ( cur.next != null && cur.data == cur.next.data ) {  //cur.next!= null是最后一个结点的筛选，直接进入else语句插入
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
               // cur = cur.next;    //当while退出时候 cur往后走一步
               /** 1多走一步 代表删除重复的元素(1 5)   2.不写代表 122335 结果为 1235*/
            }
            //2.遇到不重复的结点时候 就开始插入新链中
            else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;            //cur往后走
            }
            tmp.next =null;   /** 排除1 2 2 3 3 这种情况 因为1 连接过去 next域不为null  */
            return newHead.next;
        }

/**888888888888888888888888888回文链表判断 */
           public boolean isPalindrome( ) {
                if ( this.head == null ) {  //为空情况
                    return false;
                }
                if ( this.head.next == null ) { //为一个结点的情况
                    return true;
                }
                Node slow = this.head;
                Node fast = this.head;
                //1 此时slow是中间结点
                while (fast != null && fast.next!= null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
               //2从中间结点开始逆置链表
               Node prev = null;
               Node tmp = null;
               Node cur  = slow;
               while (cur != null) {
                   tmp = cur.next;
                   cur.next = prev;
                   prev = cur;
                   cur = tmp;
               }      //  prev 是逆置后的头

                //3 prev 与 head从头和尾同时走一步 每次不相等就是回文
                while (this.head != prev ) {
                    if (this.head.data != prev.data) {
                        return false;
                    }
                    /**判断偶数的情况*/
                    if (this.head.next == prev) {
                        return true;
                    }
                    this.head = this.head.next;
                    prev = prev.next;
                }
                /** 退出while 代表奇数情况*/
                return true;
}


 /** 10  10 10 10 10 10 10 10 是否有环*/
            public boolean hasCycle( ) {
                Node slow = this.head;
                Node fast = this.head;
                while (fast != null && fast.next !=null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    //速度是二倍 一个肯定会追上另一个
                    if (fast == slow) {
                        return true;
                    }
                }
                return false;
            }

/**11 11 11 11 11 11 11 判断环的入口*/
        public Node detectCycle( ) {
            Node slow = this.head;
            Node fast = this.head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                //速度是二倍 一个肯定会追上另一个
                if (fast == slow) {
                    break;
                }
            }
                //1因为while退出 说明是没有环的
                if (fast == null || fast.next == null) {
                    return null;
                }
                //2因为if的break退出 说明是相遇了有环 同时走 中间就是入口
                slow= this.head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
            return slow;
        }



 }

