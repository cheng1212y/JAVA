/**
 * @Description: 模拟用户登录的异常
 * @Author: Cheng
 * @Create: 2020-05-12 19:27
 **/


class UserException extends Exception {        //自定义了两个异常
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class Test3 {
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException userError) {
            userError.printStackTrace();
        } catch (PasswordException passwordError) {
            passwordError.printStackTrace();
        }
    }
    /** -----------------------   处理异常---------------*/
    public static void login(String userName, String password) throws UserException,
            PasswordException {
        if (!Test3.userName.equals(userName)) {
            throw new UserException("用户名错误");    //抛出一个自定义的异常
        }
        if (!Test3.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
}
