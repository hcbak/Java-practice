package kr.huichan.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력하세요: ");
        char simbol = sc.next().charAt(0);

        System.out.println(simbol == '+' ? first + " + " + second + " = " + (first + second) : simbol == '-' ? first + " - " + second + " = " + (first - second) : simbol == '*' ? first + " * " + second + " = " + (first * second) : simbol == '/' ? first + " / " + second + " = " + (first / second) : simbol == '%' ? first + " % " + second + " = " + (first % second) : "입력하신 연산은 없습니다. 프로그램을 종료합니다.");

    }
}
