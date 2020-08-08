import java.util.Scanner;
public class Apr9th {


public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);

      // int age = sc.nextInt();            //读取整数  浮点数   字符串
       
      // float salary = sc.nextFloat()

	   // String str = scan.next();      //next 不能读入空格 有空格会结束
		String str = scan.nextLine(); //nextLine可以读入空格
		System.out.println(str);
}


public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		//退出循环-》使用场景   OJ  笔试的环境
		//1、ctr+c(直接中断程序)   
		//2、ctr+D 正常退出
		while (scan.hasNextInt()) {
			int year = scan.nextInt();
			if( (year%4==0 && year%100!=0)  || (year %400==0)) {
				System.out.println("闰年！");
			}else{
				System.out.println("不是闰年！");
			}
		}
	}

	 // 面试问题：
	//  不能做switch参数的类型有哪些？
	//  long  float  double  boolean
	// 
	//  break尽量不要省略

	 // 枚举也可以作为switch参数
	public static void main4(String[] args) {
		int a = 1;
		switch (a) {
			case 1:
			    System.out.println("1");
			    break;
			case 2:
				System.out.println("2");
			    break;
			default:
			    System.out.println("请输入正确的数字！");
			    break;    
		}
	}




public static void main3(String[] args) {
//当 & 和 | 的操作数为整数(int, short, long, byte) 的时候, 表示按位运算, 
//当操作数为 boolean 的时候, 表示逻辑运算
//		
//				
//								
 int a = 10;
int b = 20;
System.out.println(a<b & a<b);   
 
	}





	public static void main2(String[] args) {   //此处与c语言不一样 这里的i后置 不再自加打印出来
		int i = 10;
		i = i++;  
        System.out.println(i);

	}
public static void main1(String[] args) {
    
		int j = 0;
		int sum = 0;
		for(j=1;j<=5;j++) {    
		int i = 1;
		int ret = 1;
	   	while(i <= j) {
			ret *= i;
			i++;
	     	}
	     	sum = ret+sum;

		}
		System.out.println(sum);
}
}