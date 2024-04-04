package net.ittimeline.java.foundational.contro.iifstatement.whilestatement;

import java.util.Scanner;

/**
 * while循环依据
 *
 * @author tony 254280671@qq.com
 * @version 2024/4/1 0:04
 * @since JDK11
 */
public class WhileStatementPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("请输入一个整数");
            number = input.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }


        }
        System.out.println(positiveCount + "  " + negativeCount);
    }
}
