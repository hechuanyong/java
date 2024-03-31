package net.ittimeline.java.foundational.object.operator.ogic;

/**
 * 逻辑运算
 *
 * @author tony 254280671@qq.com
 * @version 2024/3/30 22:09
 * @since JDK11
 */
public class LogicBolleanConstantOperator {
    public static void main(String[] args) {
        //逻辑与
        System.out.println("逻辑的使用" + (true & true));
        System.out.println("逻辑的使用" + (true & false));
        System.out.println("逻辑的使用" + (false & false));
        int left = 10;
        int right = 20;
        boolean flag = left++ > 10 & right-- <20;
        System.out.println(left);
        System.out.println(right);
        System.out.println(flag);
    }
}
