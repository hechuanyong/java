package net.ittimeline.java.foundational.object.operator.arithmetic;

/**
 * 算术运算
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/28 17:58
 * @since JDK11
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int left = 20;
        int right =3;
        System.out.println("lift = " + left);
        System.out.println("right = " + right);
        System.out.printf("%d + %d = %d\n", left,right,left+right);
        System.out.printf("%d - %d = %d\n", left,right,left-right);
        System.out.printf("%d * %d = %d\n", left,right,left*right);
        System.out.printf("%d  / %d = %d\n", left,right,left/right);
        System.out.printf("%d %% %d = %d\n", left,right,left%right);
        char ch = 'a';
        int result = ch +left + right;
        System.out.printf("%d + %d +%d = %d \n" , (int)ch,left,right,result);
    }
}
