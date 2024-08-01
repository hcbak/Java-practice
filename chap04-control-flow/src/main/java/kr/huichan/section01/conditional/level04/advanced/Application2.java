package kr.huichan.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력: ");
        int montly = sc.nextInt();

        System.out.print("매출액 입력: ");
        int sales = sc.nextInt();

        double bonus = sales >= 50000000 ? 0.05 : sales >= 30000000 ? 0.03 : sales >= 10000000 ? 0.01 : 0;
        int total = montly + (int) (sales * bonus);

        System.out.println("======================");
        System.out.println("매출액: " + sales);
        System.out.println("보너스율: " + (int) (bonus * 100) + "%");
        System.out.println("월 급여: " + montly);
        System.out.println("보너스 금액: " + (int) (sales * bonus));
        System.out.println("======================");
        System.out.println("총 급여: " + total);
    }
}
