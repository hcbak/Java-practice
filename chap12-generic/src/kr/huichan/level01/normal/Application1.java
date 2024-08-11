package kr.huichan.level01.normal;

import java.util.Arrays;

public class Application1 {
    public static <T> void swap (T[] value, int x, int y) {
        T tmp = value[x];
        value[x] = value[y];
        value[y] = tmp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전: " + Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("swap 후: " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전: " + Arrays.toString(strArray));
        swap(strArray, 0, 2);
        System.out.println("swap 후: " + Arrays.toString(strArray));
    }
}
