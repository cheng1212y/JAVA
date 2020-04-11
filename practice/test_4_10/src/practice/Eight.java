package practice;

public class Eight {
    public static void main( String [] args) {
        int i =0;
        int count = 0;
        for (i=1;i<=100;i++) {
            if ( i % 10 == 9 || i / 10 == 9) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
        System.out.println(count);
    }
}
