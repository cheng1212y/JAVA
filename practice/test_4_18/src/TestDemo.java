/**
 * @Description:   设计一个包含多个构造方法的类，并分别用这些构造方法来进行实例化对象
 * @Author: Cheng
 * @Create: 2020-04-18 20:22
 **/

class  Student {
    private String name ;
    private int age;
    private String sex;

    public Student () {//--------------------已经给实例成员变量赋值了
      this.name="baozi";
      this.age= 1;
      this.sex="boy";

    }
    public  Student(String name, int age ,String sex ) {  //等待被传参的构造方法
        this.name=name;
        this.age= age;
        this.sex=sex;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}



public class TestDemo {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1);


        Student st2 = new Student("xatu",18,"boy");//------------------通过传参进去
        System.out.println(st2);


    }


}
