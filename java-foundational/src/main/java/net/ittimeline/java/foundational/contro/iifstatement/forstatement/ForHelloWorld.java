package net.ittimeline.java.foundational.contro.iifstatement.forstatement;

/**
 * for循环
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/31 12:48
 * @since JDK11
 */
public class ForHelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("____________-_-");
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
        for (int i1 = 100; i1 >= 1; i1--) {
            System.out.print(i1 + "  ");
            System.out.print(i1 + " ");
        }
        System.out.println("-------------");

        for (int i2 = 1; i2 <= 100; i2++) {
            System.out.print(i2 + "  ");
        }
        System.out.println("-------------");
        for (int i2 = 1; i2 <= 100; i2++) {
            if (i2 % 2 == 0) {
                System.out.print(i2 + "  ");
            }
        }
        System.out.println("-----------------");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

}
