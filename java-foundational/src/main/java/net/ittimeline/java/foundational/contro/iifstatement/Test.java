package net.ittimeline.java.foundational.contro.iifstatement;

/**
 * @author tony 254280671@qq.com
 * @version 2024/3/31 11:54
 * @since JDK11
 */
public class Test {
    public static void main(String[] args) {
        int row=10;
        for (int i=0;i<=row;i++){
            for (int j=0;j<=row-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=row-1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}