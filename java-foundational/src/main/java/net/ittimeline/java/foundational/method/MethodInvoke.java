package net.ittimeline.java.foundational.method;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 16:55
 * @since JDK11
 */
public class MethodInvoke {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        add(left, right);
        System.out.println(add(left,right));
        int result = add(left,right);
        System.out.println(result);

    }

    /**
     * 实现两个整数相加
     *
     * @param left  第一个操作数（形参）
     * @param right 第一个操作数（形参）
     * @return 两个数相加的结果
     */
    public static int add(int left, int right) {
        return left + right;

    }
}
