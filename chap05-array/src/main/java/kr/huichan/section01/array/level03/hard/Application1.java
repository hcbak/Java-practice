package main.java.kr.huichan.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요: ");
        int num = sc.nextInt();
        int count = 0;
        
        if (num / 2 == 0 && num > 0) System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        else {
            for (int i = 0; i < num; i++) {
                if (i > num / 2) count--;
                else count++;

                System.out.print(count);
                if (i != num - 1) System.out.print(" ");
            }
        }
    }
}
