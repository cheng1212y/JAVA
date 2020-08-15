import java.util.*;

/**
 * @Description: collection的使用
 * @Author: Cheng
 * @Create: 2020-05-12 20:27
 **/
public class TestCollection {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<>(); //用了尖括号 里面是String 那么将来 collection只能放String类型的数据
        //collection将来引用的是一个顺序表 并且里面只能放字符串
        collection.add("baozi");
        collection.add("fish");                 //添加元素
        collection.add("xixi");
        collection.add("hahha");
        //  Collection<Integer> collection2 = new ArrayList<>();//放的是整形
        System.out.println(collection);      //是否是空
        System.out.println(collection.isEmpty());
        collection.remove("fish");     //删除元素
        System.out.println(collection.size());//打印个数
        Object [ ] objects = collection.toArray(); //链表变成一个数组打印出来
        System.out.println(Arrays.toString(objects));




    }
}
