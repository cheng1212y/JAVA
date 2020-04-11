package practice;

public class TwoNumber {

    public static void main( String [] args) {

        int a = 10;
        int b =666;
        int c =1212;
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        int min=(a<b)?(a<c?a:b):(b<c?b:c);
        System.out.println("Max="+max+"  "+"min="+min);
        }

    public static void main1( String [] args) {
        int a = 77;
        int b =999;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+"\n"+b);
    }


}
