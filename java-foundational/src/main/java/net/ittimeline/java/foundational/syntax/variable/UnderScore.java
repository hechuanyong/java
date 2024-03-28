package net.ittimeline.java.foundational.syntax.variable;

/**
 * JAVA7新特性，数值之间增加下划线
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/26 18:18
 * @since JDK11
 */
public class UnderScore {
    public static void main(String[] args) {
        long longVal = 1000_000_000_00_00L;
        System.out.println(longVal);
        double doubleVal = 3.1415926;
        System.out.println(doubleVal);
    }
}
