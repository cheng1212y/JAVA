package practice;
import java.util.Scanner;
public class Ten {
    public static void main(String [] args) {

      int count = 3;
      while ( count !=0) {
          Scanner sc =new Scanner(System.in);
          System.out.println("请输入密码：");
          String password = sc.nextLine();
          if (password.equals("123456")) {
              System.out.println("密码正确");
              break;
          }
          else {
              count--;
              System.out.println("还剩"+count+"次");
          }
          if (count == 0) {
              System.out.println("输入失败");
          }
      }
    }
}
