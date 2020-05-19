import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 实现自己的字符串的替换
 * @Author: Cheng
 * @Create: 2020-05-18 17:43
 **/
public class MyReplace {


    public static String myReplace( String s,char o ,char n ) {

        List<Character> list = new LinkedList<>();

        for (int i = 0; i <s.length() ; i++) {
            list.add(s.charAt(i)  );
        }
        int size = list.size();
        for (int j = 0; j <size ; j++) {
            if ( list.get(j) == o ) {
                list.set(j,n);
                break;
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
        String s = "ABCD";
        String ret = myReplace (  s,  'C','F' );
        System.out.println(   ret  );
        s.replace("a","aa");
    }
}
