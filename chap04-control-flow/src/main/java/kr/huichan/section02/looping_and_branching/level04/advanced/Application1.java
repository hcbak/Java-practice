package kr.huichan.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String plain = sc.nextLine();
        System.out.print("숫자을 입력하세요: ");
        int shift = sc.nextInt() % 26;
        String encrypte = "";

        for (int i = 0; i < plain.length(); i++) {
            int ascii = plain.charAt(i);
            if (ascii >= 65 && ascii <= 91) {
                ascii = (ascii + shift) >= 91 ? ascii + shift - 26 : ascii + shift;
            } else if (ascii >= 97 && ascii <= 123){
                ascii = (ascii + shift) >= 123 ? ascii + shift - 26 : ascii + shift;
            }
            encrypte += (char) ascii;
        }
        
        System.out.println(encrypte);
    }
}
