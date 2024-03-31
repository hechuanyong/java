package net.ittimeline.java.foundational.object.operator.ternary;

/**
 * 三元运算符使用注意事项
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/30 22:44
 * @since JDK11
 */
public class TernaryWarning {
    public static void main(String[] args) {
        double result = true ? 12:100.0;
        System.out.println(result);
        int value = true?100:(int)12.00;
        System.out.println(value);
        System.out.println(true?100:12.00);
    }
}
