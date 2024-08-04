package kr.huichan.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = new String();
        boolean check = true;
        int count = 0;

        System.out.print("문자열 입력: ");
        q = sc.nextLine();
        
        for (int i = 0; i < q.length(); i++) {
            int ascii = q.charAt(i);
            if (ascii < 65 || (ascii > 91 && ascii < 97) || ascii > 123) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                check = false;
                break;
            }
        }
        
        if (check) {
            System.out.print("문자 입력: ");
            char a = sc.nextLine().charAt(0);
                
            for (int i = 0; i < q.length(); i++) {
                if (q.charAt(i) == a) {
                    count++;
                }
            }
            System.out.println("포함된 갯수: " + count + "개");
        }
    }
}
