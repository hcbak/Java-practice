package kr.huichan.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].substring(0, 1).toUpperCase() + input[i].substring(1, input[i].length());
            System.out.print(input[i] + " ");
        }
    }
}
