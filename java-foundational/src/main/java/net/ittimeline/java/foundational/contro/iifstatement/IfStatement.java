package net.ittimeline.java.foundational.contro.iifstatement;

import java.util.Scanner;

/**
 * if分枝
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/31 11:29
 * @since JDK11
 */
public class IfStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("你成年了，可以到网吧上网");
        }
        int x = 30;

        if (x < 20) {
            System.out.print("这是 if 语句");
        } else {
            System.out.print("这是 else 语句");
        }

    }
}

