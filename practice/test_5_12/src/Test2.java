/**
 * @Description:    注意==比较的是地址
 * @Author: Cheng
 * @Create: 2020-05-12 12:30
 **/
public class Test2{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";   //==比较的是地址
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}