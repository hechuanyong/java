package net.ittimeline.java.foundational.method;

import java.util.Arrays;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/6 13:12
 * @since JDK11
 */
public class MethodArgsPassTest {
    public static void main(String[] args) {
        int[] addArray=null;
        System.out.println(Arrays.toString(addArray));
        int[] newAddArray =net.ittimeline.java.foundational.method.MethodArgsPass.add(addArray,4);
        System.out.println(Arrays.toString(newAddArray));
    }
}
