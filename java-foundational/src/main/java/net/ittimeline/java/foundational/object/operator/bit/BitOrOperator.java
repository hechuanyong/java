package net.ittimeline.java.foundational.object.operator.bit;


/**
 * 按位或
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/31 9:15
 * @since JDK11
 */
public class BitOrOperator {
    public static void main(String[] args) {
        // 128 补码 0000 0000 0000 0000 0000 1000 0000 |
        // 64  补码 0000 0000 0000 0000 0000 0100 0000
        //         0000 0000 0000 0000 0000 1100 0000    192
        System.out.println(128 | 64);
        /*
         * 按位异或 ^
         * 256 补码 0000 0000 0000 0000 0001 0000 0000 ^
         * 256 补码 0000 0000 0000 0000 0001 0000 0000 =
         *          0000 0000 0000 0000 0001 0000 0000
         */
        System.out.println("256^256 =" + (256 ^ 256));
        System.out.println("256^256 =" + 0);
        /*
         * ~1=0 ~0=1
         * 245 补码  ~ 0000 0000 0000 0000 0000 1111 0101 =
         * 245 取反    1111 1111 1111 1111 1111 0000 1010
         * 245 补码转换为反码 -1；
         *              1111 1111 1111 1111 1111 0000 1001
         * 256 反码转换为元码第一位不变，取反： 1000 0000 0000 0000 0000 1111 0110
         */
        System.out.println(~245);
        System.out.println(~-245);
        System.out.println(~123);

    }
}
