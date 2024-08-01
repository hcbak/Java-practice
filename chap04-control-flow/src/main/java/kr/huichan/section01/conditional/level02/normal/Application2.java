package kr.huichan.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("체중(kg): ");
        double kg = sc.nextInt();
        System.out.print("신장(m): ");
        double m = sc.nextInt() / 100.0;

        double BMI = kg / (m * m);
        System.out.println( BMI < 20 ? "당신은 저체중 입니다." : BMI < 25 ? "당신은 정상체중 입니다." : BMI < 30 ? "당신은 과체중 입니다." : BMI >= 30 ? "당신은 비만 입니다." : "");
    }
}
