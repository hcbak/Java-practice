package kr.huichan.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요: ");
        int korean = sc.nextInt();

        System.out.print("영어 점수를 입력하세요: ");
        int english = sc.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int math = sc.nextInt();

        double average = (korean + english + math) / 3;
        boolean limit = korean >= 40 && english >= 40 && math >= 40;

        System.out.println(average >= 60 && limit ? "합격입니다!" : average < 60 ? "평균 점수 미달로 불합격입니다." : korean < 40 ? "국어 점수 미달로 불합격입니다." : english < 40 ? "영어 점수 미달로 불합격입니다." : math < 40 ? "수학 점수 미달로 불합격입니다." : "");
    }
}
