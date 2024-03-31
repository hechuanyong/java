package net.ittimeline.java.foundational.object.operator.ternary;

/**
 * 三元运算符
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/30 22:32
 * @since JDK11
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //布尔表达式？ 结果1：结果2
        int left = 10;
        int right = 20;
        int max = left > right ? left : right;
        int min = left < right ? left : right;
        System.out.println(max);
        System.out.println(min);
    }
}
