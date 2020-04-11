package practice;
public class Nine {
    public static void main(String [] args) {
        int n = 0;
        for(n=0;n<=999999;n++)
        {
            int count = 1;
            int tmp = n;
            int sum = 0;

            while (tmp / 10!=0)
            {
                count++;
                tmp= tmp/ 10;
            }
            tmp = n;
            while (tmp!=0)//1
            {
                sum = sum + (int)Math.pow(tmp%10,count);
                tmp = tmp / 10;
            }
            if (sum == n)
                System.out.println(n);
        }
    }
}
