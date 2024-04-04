package net.ittimeline.java.foundational.contro.iifstatement.forstatement;

/**
 * 水仙花数
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/31 23:25
 * @since JDK11
 */
public class ForNarcissisticNumber {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i < 1000; i++) {
            int unit = i % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100 % 10;
            int value = unit*unit*unit+ten*ten*ten+hundred*hundred*hundred;
            if (i==value){
                count++;
                System.out.println(i);
            }

        }
        System.out.println(count);
    }
}
