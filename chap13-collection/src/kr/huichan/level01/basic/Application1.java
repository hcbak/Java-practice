package kr.huichan.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        String answer = new String();
        String question = new String();

        while (true) {
            System.out.print("학생 성적: ");
            answer = sc.nextLine();
            al.add(Integer.parseInt(answer));

            System.out.print("추가 입력화려면 y: ");
            question = sc.nextLine();
            if (!question.equals("y")) break;
        }

        double tmp = 0;
        for (int i = 0; i < al.size(); i++) {
            tmp += al.get(i);
        }
        System.out.println("학생 인원: " + al.size() + "\n평균 점수: " + tmp / al.size());
    }
}
