package practice;
//1*1
//2*1 2*2
public class Five {
    public static void main(String [] args) {
        int i = 0;
        for (i=1;i<=9;i++) {
            int j = 0;
            for (j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}
