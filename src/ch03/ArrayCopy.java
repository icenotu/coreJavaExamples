package ch03;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};

        //变量arr1和arr2 指向同一个数组
        int[] arr2 = arr1;
        arr1[3] = 12;
        System.out.println(arr2[3]);

        //变量arr1和arr3 指向不同的两个数组
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        arr1[3] = 33;
        System.out.println(arr3[3]);
        System.out.println(arr1[3]);
    }
}
