package kr.huichan.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나 내놔");
        int input = sc.nextInt();

        System.out.println(10 >= input && input >= 1 ? input % 2 == 0 ? "짝수다." : "홀수다." : "반드시 1~10 사이의 정수를 입력해야 합니다.");
    }
}
