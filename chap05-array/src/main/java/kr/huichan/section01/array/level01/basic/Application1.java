package main.java.kr.huichan.section01.array.level01.basic;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) num[i] = i + 1;

        System.out.println(Arrays.toString(num));
    }
}
