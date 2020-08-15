import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: map接口的使用
 * @Author: Cheng
 * @Create: 2020-05-12 20:58
 **/
public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("猫咪","包子");  //map 有 key值 与 value值
        map.put("行者","孙悟空");
        map.put("及时雨","宋江");
        System.out.println(map); //底层实现了tostring方法可以这样打印
        String S =  map.getOrDefault("猫咪2","找不到");//找不到就默认值代替
        System.out.println(S);
        System.out.println(map.containsKey("猫咪"));//是否包含k
        System.out.println(map.containsValue("孙悟空"));//是否包含V
        System.out.println("```````````````");
        Set<    Map.Entry<String, String>    > set = map.entrySet();//将所有键值对返回
        for ( Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+" => " + entry.getValue());
        }
        System.out.println(map.isEmpty()); //为空？
        System.out.println(map.size());     // 长度
    }
}
