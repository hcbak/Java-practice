package kr.huichan.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나 내놔");
		System.out.println(sc.nextInt() > 0 ? "양수다." : "양수가 아니다.");
	}
}
