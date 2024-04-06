package net.ittimeline.java.foundational.array;

/**
 * @author tony 254280671@qq.com
 * @version 2024/4/5 11:31
 * @since JDK11
 */
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = numbers.length-1;
        int target =6;
        int targetIndex=-1;
        while (start<=end){
            int mid= (start+end)/2;
//            System.out.println(mid);
            if(numbers[mid]==target){
                targetIndex=mid;
                break;
            }else if(numbers[mid]>target){
                end=mid;
            }else if (numbers[mid]<target){
                start=mid;
            }
        }
        if (targetIndex!=-1){
            System.out.println(targetIndex);
            System.out.println(target);
        }else {
            System.out.println(target+ "没有找到");
        }
    }
}
