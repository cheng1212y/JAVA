/**
 * @Description:   equals 比较的是字符串的内容
 * @Author: Cheng
 * @Create: 2020-05-12 12:34
 **/
public class Test3 {
    public static void main(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }
}
