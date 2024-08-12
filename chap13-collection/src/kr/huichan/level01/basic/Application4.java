package kr.huichan.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        String answer = new String();

        while (true) {
            int oldSize = hs.size();
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            answer = sc.nextLine();
            if (answer.equals("exit")) break;

            hs.add(answer);
            if (oldSize == hs.size()) System.out.println("이미 등록된 ID입니다.");
            else System.out.println("ID가 추가 되었습니다.");
        }
        
        System.out.println("모든 학생의 ID: " + hs);
    }
}
