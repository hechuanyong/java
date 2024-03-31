package net.ittimeline.java.foundational.object.operator.bit;

/**
 * 位运算符
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/31 9:06
 * @since JDK11
 */
public class BitAndOperator {
    public static void main(String[] args) {
        // 255 0000 00000 0000 0000 0000 0000 1111 1111 &
        // 15  0000 00000 0000 0000 0000 0000 0000 1111
        //     0000 00000 0000 0000 0000 0000 0000 1111   15
        // 计算机用补码计算
        System.out.println(254 & 15);

    }
}
