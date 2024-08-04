package kr.huichan.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요: ");
        int pay = sc.nextInt();
        System.out.print("상품 가격을 입력하세요: ");
        int price = sc.nextInt();
        int change = pay - price;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("============================");
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i] + "원권 " + (unit[i] < 1000 ? "동전 " : "지폐 ") + (change / unit[i]) + (unit[i] < 1000 ? "개" : "장"));
            change %= unit[i];
        }

        System.out.println("============================\n거스름돈: " + (pay - price) + "원");
    }
}
