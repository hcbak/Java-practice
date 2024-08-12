package kr.huichan.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> qu = new LinkedList<>();
        boolean whileSwitch = true;
        String answer = new String();
        
        while (whileSwitch) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            answer = sc.nextLine();

            switch (answer) {
                case "next":
                    if (qu.isEmpty()) System.out.println("대기 고객이 없습니다.");
                    else System.out.println(qu.poll() + " 고객님 차례입니다.");
                    break;

                case "exit":
                    whileSwitch = false;
                    break;
                    
                default:
                    qu.offer(answer);
                    System.out.println(answer + " 고객님 대기 등록 되었습니다.");
                    break;
            }
        }
    }
}
