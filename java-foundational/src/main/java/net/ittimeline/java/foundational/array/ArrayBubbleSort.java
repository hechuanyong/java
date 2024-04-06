package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 10:29
 * @since JDK11
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                numbers[j] = numbers[j] ^ numbers[j + 1];
                numbers[j + 1] = numbers[j] ^ numbers[j + 1];
                numbers[j] = numbers[j] ^ numbers[j + 1];

            }
            System.out.println(Arrays.toString(numbers));

            count++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);
        System.out.println(count);
    }
}
