/**
 * @Description:  实现自己的 查找子串的下标
 * @Author: Cheng
 * @Create: 2020-05-19 14:35
 **/
public class MyIndexOf {

    public static void main(String[] args) {
        int ret = 0;
        try {
            String s = "ABCDE";
             ret = myIndexOf(s, "CDE");
        }
        catch ( Exception e) {
            e.printStackTrace();
        }
        System.out.println(ret);
    }

    public static int myIndexOf(String src, String dst) throws Exception{

        if(null == src || src.length() < 1 || null == dst || dst.length() < 1){  //排查两个字符串
            return -1;
        }

        if(dst.length() > src.length()){     //子串长大于原来串
            return -1;
        }

        char[] srcArray = src.toCharArray();
        char[] dstArray = dst.toCharArray();
        int srcLen = srcArray.length;
        int dstLen = dstArray.length;

        for(int i = 0; i < srcLen; i++){

            if(srcArray[i] == dstArray[0] && (i+dstLen <= srcLen)){   //初始的时候 应该和子串的0位置比较

                int equalCount = 0;
                for (int j = 0; j < dstLen; j++){
                    if(srcArray[i+j] == dstArray[j]){     //每次都往后走一个位置进行匹配
                        equalCount++;
                    }
                }

                if(equalCount == dstLen){   //查看子串的长度是否匹配
                    return i;
                }
            }
        }
        return -1;
    }

}
