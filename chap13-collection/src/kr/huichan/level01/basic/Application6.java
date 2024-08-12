package kr.huichan.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        String answer = new String();
        boolean whileSwitch = true;

        while (whileSwitch) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            answer = sc.nextLine();

            switch (answer) {
                case "search":
                    System.out.print("검색 할 이름: ");
                    answer = sc.nextLine();
                    if (hm.get(answer) == null) System.out.println(answer + "씨의 전화번호는 등록 되어 있지 않습니다.");
                    else System.out.println(answer + "씨의 전화번호: " + hm.get(answer));
                    break;

                case "exit":
                    whileSwitch = false;
                    break;
                    
                default:
                    String[] toMap = answer.split(" ");
                    try {
                        hm.put(toMap[0], toMap[1]);
                        System.out.println("추가 완료: " + toMap[0] + " " + toMap[1]);
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요: <이름> <전화번호>");
                    }
                    break;
            }
        }
    }
}
