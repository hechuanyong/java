package net.ittimeline.java.foundational.array;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/4 23:46
 * @since JDK11
 */
public class ArrayStatic {
    public static void main(String[] args) {
        int left = 100;
        int right = -5;

        left = left ^ right;

        System.out.println(left);

        right = left ^ right;
        System.out.println(right);

        left = left ^ right;
        System.out.println(left);


        System.out.println(right);

    }
}

