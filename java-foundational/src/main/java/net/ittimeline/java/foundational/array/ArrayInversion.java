package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 9:58
 * @since JDK11
 */
public class ArrayInversion {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        int starIndex=0;
        int endIndex=numbers.length-1;
        int count=0;
        while (starIndex<endIndex){
            numbers[starIndex]= numbers[starIndex]^numbers[endIndex];
            numbers[endIndex]= numbers[starIndex]^numbers[endIndex];
            numbers[starIndex]= numbers[starIndex]^numbers[endIndex];
            System.out.println(Arrays.toString(numbers));
            starIndex++;
            endIndex--;
            count++;

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(count);
    }
}
