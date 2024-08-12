package kr.huichan.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> qu = new LinkedList<>();
        String answer = new String();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료): ");
            answer = sc.nextLine();
            qu.addFirst(answer);
            if (answer.equals("exit")) break;
            if (qu.size() > 5) qu.removeLast();

            System.out.println("최근 방문 url: " + qu);
        }
    }
}
