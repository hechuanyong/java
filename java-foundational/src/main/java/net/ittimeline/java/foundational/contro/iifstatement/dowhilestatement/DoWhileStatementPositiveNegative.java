package net.ittimeline.java.foundational.contro.iifstatement.dowhilestatement;

import java.util.Scanner;

/**
 * do/while循环
 *
 * @author tony 254280671@qq.com
 * @version 2024/4/4 18:12
 * @since JDK11
 */
public class DoWhileStatementPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int number;
        do {
            System.out.println("请输入一个整数");
            number = input.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }
        while (number != 0);
        System.out.println(positiveCount + "  " + negativeCount);
    }
}
