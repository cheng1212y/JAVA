import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:   实现自己的字符串分割  借助顺序表
 * @Author: Cheng
 * @Create: 2020-05-18 16:41
 **/

public class MySplit {


    /** 方法二 */
   /* public static String[] split(String array, String target) {
        List<String> list = new ArrayList<>();
        while (array.contains(target)) {
            int index = array.indexOf(target);
            String temp = array.substring(0, index);
            list.add(temp);
            array = array.substring(index + target.length()); //substring(endIndex)删除endIndex之前的字符串
        }
        list.add(array);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }*/

    public static String mySplit ( String s, char target ) {
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(   s.charAt(i)  ); //字符串存储在顺序表中
        }
        int size = list.size();
        for (int j = 0; j <size ; j++) {
            if (  list.get(j) == target) {
                list.remove(j);
                size--;                 //删除一个 顺序表长度减去1 否则越界
            }
        }
        int size2 = list.size();
        char [] ret = new char[size2];
        for (int k = 0; k < size2; k++) {
            ret[k] = list.get(k);
        }
        return new String (ret) ;
    }
    public static void main(String[] args) {
        String s = "192.168.1.1";
        String ret = mySplit (  s,  '.' );
        System.out.println(   ret  );
    }
}
