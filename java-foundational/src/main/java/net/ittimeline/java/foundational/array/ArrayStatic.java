package net.ittimeline.java.foundational.array;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/4 23:46
 * @since JDK11
 */
public class ArrayStatic {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
//        System.out.println(numbers[-1]);
        numbers = null;
        System.out.println(numbers);

        if ( null!=numbers ) {
            System.out.println(numbers[2]);

        }
    }
}
