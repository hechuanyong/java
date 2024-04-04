package net.ittimeline.java.foundational.contro.iifstatement.forstatement;

/**
 * @author tony 254280671@qq.com
 * @version 2024/3/31 23:41
 * @since JDK11
 */
public class ForIfElseNestArithmeticLogic {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            int unit = i % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100 % 10;
            int thousand = i / 1000 % 10;
            if (unit + hundred == ten + thousand && unit % 2 == 0 && thousand % 2 != 0) {
                count++;
                System.out.print(i + " ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }

        }
        System.out.println(count);
    }
}