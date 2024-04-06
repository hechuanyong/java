package net.ittimeline.java.foundational.method;

/**
 * 测试整数相关功能的测试用例
 *
 * @author tony 254280671@qq.com
 * @version 2024/4/5 17:33
 * @since JDK11
 */
public class NumberUtilsTest {
    public static void main(String[] args) {
        int left = 200;
        int right = 200;
        boolean result =NumberUtils.compare(left,right);
        System.out.println(result?"俩数相等":"不相等");
        int sum = NumberUtils.sum(1,100);
        System.out.println(sum);

    }


}
