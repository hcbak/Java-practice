package kr.huichan.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 하나 내놔");
        System.out.println(sc.nextInt() % 2 == 0 ? "짝수다." : "홀수다.");
    }
}
