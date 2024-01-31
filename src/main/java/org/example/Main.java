package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PyramidSort pyramidSort = new PyramidSort();

        int[] arr = new int[]{23, 435, 12, 54, 67, 89, 21};

        System.out.println(Arrays.toString(arr));
        pyramidSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}