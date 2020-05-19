/**
 * @Description:  查找主串是否包含子串   ---------与查下标一致做法
 * @Author: Cheng
 * @Create: 2020-05-19 15:10
 **/
public class MyContains {

    public static class MyIndexOf {

        public static void main(String[] args) {

                String s = "ABCDE";
                boolean ret2  = myContains(s, "ABCDE");
               System.out.println(ret2);
        }

        public static boolean myContains(String src, String dst) {

            if(null == src || src.length() < 1 || null == dst || dst.length() < 1){  //排查两个字符串
                return false;
            }

            if(dst.length() > src.length()){     //子串长大于原来串
                return false;
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
                        return true;
                    }
                }
            }
            return false;
        }

    }
}
