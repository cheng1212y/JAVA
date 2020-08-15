/**
 * @Description: 自动拆装箱
 * @Author: Cheng
 * @Create: 2020-05-12 21:32
 **/
public class TestBoxing {



    /** i >= - 128 && i <= 127
     * 如果给定的范围是这个内，每次就会在这个下标中去取数字
     * 否则就开始new对象了*/
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b ); //引用类型比较地址 true

        Integer c = 222;
        Integer d = 222;
        System.out.println(c == d ); //引用类型比较地址 false

    }










    /** 自动装拆箱*/
    public static void main2(String[] args) {
        int i = 10;
        Integer ii = i; // 自动装箱方式一
        Integer ij = (Integer)i; // 自动装箱方式二

        int j = ii; // 自动拆箱方式一
        int k = (int)ii; // 自动拆箱方式二

    }
    /** 手动装拆箱*/
    public static void main1(String[] args) {
        int a = 10;
// 装箱操作，新建一个 Integer 类型对象，将 i 的值放入对象的某个属性中
        Integer b = Integer.valueOf(a); //装箱方式一
        Integer c = new Integer(a);     //装箱方式二
// 拆箱操作，将 Integer 对象中的值取出，放到一个基本数据类型中
        int s = b.intValue();
    }
}
