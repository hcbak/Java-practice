package main.java.kr.huichan.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 하나 입력하세요: ");
        String string = sc.nextLine();
        char[] carr = string.toCharArray();

        System.out.print("검색할 문자를 입력하세요: ");
        char search = sc.nextLine().charAt(0);
        int count = 0;

        for (char i : carr) if (i == search) count++;

        System.out.println("입력하신 문자열 " + string + "에서 찾으시는 문자 " + search + "은(는) " + count + "개 입니다.");
    }
}
