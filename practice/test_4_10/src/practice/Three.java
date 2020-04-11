package practice;
public class Three {
    public static void main( String [] args) {
        System.out.print(1+"\t"+2+"\t");

        int i = 3;
        while (i<=100) {
            int j =0;
            for (j = 2 ; j<i;j++) {
                if(i%j == 0)
                    break;
            }

            if (i==j) {
                System.out.print(i+"\t");
            }
            i++;
        }

    }

}
