package net.ittimeline.java.foundational.syntax.conversion;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * 7种数据类型的自动转换
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/26 19:34
 * @since JDK11
 */
public class AutoConversion {
    public static void main(String[] args) {
        //Float的最大值
        float fltMax = Float.MAX_VALUE;
        System.out.println(fltMax);
        System.out.printf("\n 单精度浮点类型最大值是：\n %.2f ", fltMax);
        long longMax = Long.MAX_VALUE;
        System.out.println("\n longMax = " + longMax);
    }
}
