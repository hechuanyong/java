package net.ittimeline.java.foundational.method;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 17:23
 * @since JDK11
 */
public class NumberUtils {

    /**
     * 比较两个整数是否相等
     * @param left 第一个参数
     * @param right 第二个参数
     * @return 是否相等
     */
    public static boolean compare(int left,int right){
        return left==right;
    }
    /**
     * 实现指定区间的整数和
     * @param start 开始位置
     * @param end 结束位置
     * @return 累计和
     */
    public static int sum(int start,int end){
        int result =0;
        for (int i = start; i <=end; i++) {
            result +=i;

        }
        return result;
    }
}
