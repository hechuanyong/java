package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 15:52
 * @since JDK11
 */
public class Test {
    public static void main(String[] args) {
//        int[][] numbers=new int[][]{{1,2,3},{4,5},{6,7,8}};
////        int[][] numbers={{1,2,3},{4,5},{6,7,8}};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers[0]));
//        System.out.println(numbers[2][2]);

//        int[][] numbers= new int[3][2];
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1][1]);
//        numbers[1][1]=32;
//        System.out.println(numbers[1][1]);
        System.out.println("    员工编号    员工姓名    员工年龄    员工性别    员工薪水");
        String[][] employeeList = new String[][]{{"00001","tony","30","男","10000"},{"00002","jack","27","男","3000"},
                {"00003","tiffany","24","女","10000"}};
        for (int i = 0; i < employeeList.length; i++) {
            for (int j=0;j<employeeList[i].length;j++){
                System.out.printf("%10s",employeeList[i][j]);

            }
            System.out.println();

        }
    }
}
