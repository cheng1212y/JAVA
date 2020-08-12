package com.msi.c;
import java.util.Arrays;
/**
 * @Description: 接口的使用实例：
 *     一般情况下：自定义类型进行比较 是 可比较的。  通过实现Comparable我接口 重写ccompareTo方法
 *      Comparable   Comparator  有区别的！！！
 * @Author: Cheng
 * @Create: 2020-04-30 13:46
 **/
class Student implements Comparable <Student>{ //实现了一个Comparable接口 < >代表的是泛型 里面是要比较的东西 ，接口下面有一个compareTo抽象方法 就需要重写
    String name;
    int age ;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


      @Override      /**  Comparable 接口下面有一个compare抽象方法 就需要重写*/
    public int compareTo(Student o) {  //使用当前对象和传进来的参数进行比较
        if (this.age >   o.age) {  // > 从小到大排序       <  从大到小排序
            return 1;
        }
        else if (this.age == o.age) {
            return 0;
        }
        else {
            return -1;
        }
}


public class TestDemo {

}
    public static void main(String[] args) {
        Student student1 = new Student("baozi",1,66);
        Student student2 = new Student("cheng",21,99);
        Student student3 = new Student("qian",17,100);

        Student [ ]  students  = new Student[ ] {student1,student2,student3 };

       /* if (student1.compareTo(student2)<0 ) {  // student1 就是当前对象
            System.out.println("学生1 年龄小于  学生2");
        }*/

        Arrays.sort(students);                  //此时就达到了根据数组中 年龄排序的目的
        System.out.println(Arrays.toString(students));


    }
}
