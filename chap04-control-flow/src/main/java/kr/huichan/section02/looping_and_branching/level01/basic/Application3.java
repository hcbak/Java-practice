package kr.huichan.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i % 2 == 0 ? i : 0;
        }

        System.out.println("1부터 " + num + "까지의 짝수의 합: " + result);
    }
}
