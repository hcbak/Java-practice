package kr.huichan.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<>();
        String answer = new String();

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            answer = sc.nextLine();
            if (answer.equals("exit")) break;
            ts.add(answer);
        }

        System.out.println("정렬 된 단어: " + ts);
    }
}
