import java.util.Scanner;

/**
 * @Description: 一个类Calculator, 有两个属性num1, num2, 这两个数据的值，不能在定义的同时初始化，最后实现加减乘
 * 除四种运算
 * @Author: Cheng
 * @Create: 2020-04-18 19:11
 **/
class Calculator {

    private    double num1 ;
    private    double num2 ;


    public  double sum (  ) {//加
        return this.num1+this.num2;  //------------无需 传参 set已经设置num1 num2
    }

    public  double dif (  ) {//减
        return this.num1-this.num2;  //------------无需 传参 set已经设置num1 num2
    }

    public  double pro (  ) {//乘
        return this.num1*this.num2;  //------------无需 传参 set已经设置num1 num2
    }

    public  double quo (  ) {//除
        return this.num1/this.num2;  //------------无需 传参 set已经设置num1 num2
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}

public class Test {
    public static void main(String[] args) {

        Calculator  ca = new Calculator( ) ;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个数字进行计算：");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        ca.setNum1(num1);    //传值
        ca.setNum2(num2);

        System.out.println(num1+"+"+num2+"=" + ca.sum(  )); //无需 传参 set已经设置
        System.out.println(num1+"-"+num2+"=" + ca.dif(  ));
        System.out.println(num1+"*"+num2+"=" + ca.pro(  ));
        System.out.println(num1+"/"+num2+"=" + ca.quo(  ));

    }

}
