package main.java.kr.huichan.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요: ");
        int input = sc.nextInt();

        System.out.println(input < 0 || input > 4 ? "준비된 과일이 없습니다." : fruit[input]);
    }
}
