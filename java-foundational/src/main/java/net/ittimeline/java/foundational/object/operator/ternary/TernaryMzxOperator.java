package net.ittimeline.java.foundational.object.operator.ternary;

import java.util.Scanner;

/**
 * 求三个整数的最大值
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/30 22:54
 * @since JDK11
 */
public class TernaryMzxOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int left = input.nextInt();
        System.out.println("请输入第二个整数：");
        int middle = input.nextInt();
        System.out.println("请输入第三个整数：");
        int right = input.nextInt();
        System.out.println(left + "##" + middle + "%%" + right);
        // int temp = left > middle ? left : middle;
        int max = left > right ? left : right > middle ? right : middle;

        System.out.println(max);


    }
}
