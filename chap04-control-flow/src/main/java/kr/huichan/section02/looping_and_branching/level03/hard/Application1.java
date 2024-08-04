package kr.huichan.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean tf = true;

        while (num <= 2) {
            System.out.print("2보다 큰 정수를 하나 입력하세요: ");
            num = sc.nextInt();

            if (num <= 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                tf = false;
                break;
            }
        }

        System.out.println(tf ? "소수다." : "소수가 아니다.");
    }
}
