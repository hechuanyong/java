package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 10:52
 * @since JDK11
 */
public class ArraySelectSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 4, 3, 2, 1};
        int count = 0;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[i] ^ numbers[j];
                    numbers[j] = numbers[i] ^ numbers[j];
                    numbers[i] = numbers[i] ^ numbers[j];
                    count++;
                    System.out.println(Arrays.toString(numbers));
                    System.out.println(count);
                }


            }


        }
    }
}
