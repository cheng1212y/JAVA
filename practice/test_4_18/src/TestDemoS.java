/**
 * @Description:  交换两个数字
 * @Author: Cheng
 * @Create: 2020-04-18 20:45
 **/

class Num {
    private int a ;
    private int b ;



    public  void swap (  ) {//-----------通过this 是当前对象的引用来做的交换 就像数组也是引用
        int c= this.a;
        this.a = this.b;
        this.b= c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class TestDemoS {
    public static void main(String[] args) {
        Num num = new Num();
        num.setA(1);
        num.setB(999);
        num.swap( );
        System.out.println(num.getA());
        System.out.println(num.getB());

    }


}
