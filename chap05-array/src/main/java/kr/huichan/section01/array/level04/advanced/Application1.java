package main.java.kr.huichan.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int point = 0;
        int tmp = 0;

        while (lotto[5] == 0) {
            tmp = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < lotto.length; j++) {
                if (tmp == lotto[j]) break;
                else if (j == (lotto.length - 1) && tmp != lotto[j]) {
                    lotto[point] = tmp;
                    point++;
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
