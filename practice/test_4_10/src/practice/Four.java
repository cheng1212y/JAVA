package practice;

public class Four {
    public static void main(String [] args) {
        int year = 1000;
         while (year >= 1000 && year <= 2000) {
		       if ((year%4==0 && year%100!=0) || (year%400==0))
			   System.out.println(year);
		          year++;
	     }
    }
}
