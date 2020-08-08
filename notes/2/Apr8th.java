public class Apr8th {
 
public static void main(String[] args) {
	
	//字符串转为int
/*String str = "100";
int num = Integer.parseInt(str);
 System.out.println(num);
*/

//int 转为字符串
int num = 10;
String str1 = num + " ";     //方法一
String str2 = String.valueOf(num); //方法二
System.out.println(str1);

}


public static void main6(String[] args) {
String a = "hello";
String b = "world";
String c = a + b;            //字符串中的+表示拼接
System.out.println(c);
	
}

 	/**
	 * 小于4个字节的数据类型 运算的时候 会发生类型的提升
	 * : byte 和 byte 都是相同类型, 但是出现编译报错. 原因是, 虽然 a 和 b 都是 byte, 但是计算 a + b 会先将 a 和 b 都
*提升成 int, 再进行计算, 得到的结果也是 int, 这是赋给 c, 就会出现上述错误.
*由于计算机的 CPU 通常是按照 4 个字节为单位从内存中读写数据. 为了硬件上实现方便, 诸如 byte 和 short 这种低于
*4 个字节的类型, 会先提升成 int, 再参与计
	 * @param args [description]
	 */
	public static void main5 (String[] args) {
		byte b = 10;
		byte c = 20;
		byte d = (byte)(b+c);
		System.out.println(d);
		System.out.println(b+ " "+c);
		System.out.println(Byte.MAX_VALUE);
		//byte e = Byte.MAX_VALUE+1;      //精度丢失 会报错
		//System.out.println(e);


	}

public static void main4 (String[] args) {   
	
	for (int i = 0;i<args.length;i++) {  
 		System.out.println(args[i]);       

	}                                     // String[] args 是运行时命令行参数
         System.out.println("xixi");
}




public static void main3(String[] args) {
	
int a =10;
int b = 20;
System.out.println("xixi"+b+a);//有一个字符串就会进行拼接

}

public static void main2(String[] args) {
	  byte a = 1;
	  char b  ='2';
	  short c = 2;
	  int d = 4;
      long e = 8L;
      float f = 4F;    //浮点数 精确到小数点后六位
      double g = 8.0;
   
     boolean value = true;
    
    System.out.println(value); 
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
}

 public static void main1 (String [] args) {
    int  a  =13;

    System.out.println(Integer.MAX_VALUE);
    int b = Integer.MAX_VALUE+1;
     System.out.println(b);
}
    }