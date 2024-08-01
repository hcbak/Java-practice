package kr.huichan.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과일 이름을 입력하세요: ");
        String fruit = sc.nextLine();

        System.out.println(fruit.equals("사과") ? "사과의 가격은 1000원 입니다." : fruit.equals("바나나") ? "바나나의 가격은 3000원 입니다." : fruit.equals("복숭아") ? "복숭아의 가격은 2000원 입니다." : fruit.equals("키위") ? "키위의 가격은 5000원 입니다." : "준비된 상품이 없습니다.");
    }
}
