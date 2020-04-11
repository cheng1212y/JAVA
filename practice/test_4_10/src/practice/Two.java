package practice;
import java.util.Scanner;
public class Two {
    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int i = 0;
        int count = 0;
        for(i=2;i<a;i++) {
           if ( a % i == 0) {
               count++;
           }
        }
              if (count == 0) {
                  System.out.println("是素数");
              }
              else {
                  System.out.println("不是素数");
              }
    }
}
