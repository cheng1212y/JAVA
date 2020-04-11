package practice;
import java.util.Scanner;
public class Six {
    public static void main( String [] args) {

        int c = 0;
        int x = 0;
        System.out.println("请输入两个整数来计算最大公因子"+"\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {                  //为了使得大数在前小数在后
            x = b;
            b = a;
            a = x;
        }
              while(b!=0) {
              c = a % b;
              a = b;
              b = c;
              }
             System.out.println("两数的最大公约数是"+a);
    }
}
