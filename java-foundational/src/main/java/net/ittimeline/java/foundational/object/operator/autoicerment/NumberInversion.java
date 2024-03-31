package net.ittimeline.java.foundational.object.operator.autoicerment;
import java.util.Scanner;
/**
 * @author tony 254280671@qq.com
 * @version 2024/3/28 18:59
 * @since JDK11
 */
public class NumberInversion {
    public static void main(String[] args) {
        System.out.println("请输入一个四位整数");
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        System.out.println("你从键盘输入的是：" + number);
        int unit = number%10;
        int ten = number/10%10;
        int hundred = number/100%10;
        int thousand = number/1000%10;
        System.out.printf("%d%d%d%d\n",unit,ten,hundred,thousand);
        int result = unit*1000+ ten * 100 + hundred * 10 + thousand;
        System.out.printf("%d\n",result);


    }
}
