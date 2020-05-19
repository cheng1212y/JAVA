/**
 * @Description:  传值不一定就改变了值
 * @Author: Cheng
 * @Create: 2020-05-12 12:20
 **/
public class Test1{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";                            //引用指向了一个新的值
        ch[0] = 'g';                                //通过引用修改了原值
    }
}