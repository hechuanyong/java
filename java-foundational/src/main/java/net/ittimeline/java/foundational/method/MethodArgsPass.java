package net.ittimeline.java.foundational.method;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/6 13:09
 * @since JDK11
 */
public class MethodArgsPass {
    public static int[] add(int[] array, int element) {
        if (array == null) {
            return null;
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }

}
