
import java.util.Scanner;
import java.util.Random;
public class Apr11 {
    public static void main(String[] args) {
        Random n = new Random();                   //Random方法用来产生随机数，要引用import java.util.Random;包
        int guess = n.nextInt(100 );
        System.out.println(guess);
    }





    public static void main3(String[] args) {
        int count = 3;
        while (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (password.equals("123456")) {                        //比较两个字符串是否相等，用 equals 方法
                System.out.println("密码正确");
                break;
            } else {
                count--;
                System.out.println("还剩" + count + "次");
            }
            if (count == 0) {
                System.out.println("输入失败");
            }
        }
    }







    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 2; i <= (int)Math.sqrt(n) ;i++ ) {     // Math方法不需要手动导入，因为是lang包，它的返回值是静态的
            if(n % i == 0) {                                //pow方法求幂
                System.out.println(n+"  不是素数！");
                break;
            }
        }

    }



    public static void main1(String[] args) {    //对于字符串,数字的录入等录入的使用
       // 需要导入 util 包
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名: "+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
        sc.close(); // 注意, 要记得调用关闭方法
    }
}
