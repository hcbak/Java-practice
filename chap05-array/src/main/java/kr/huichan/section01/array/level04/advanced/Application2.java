package main.java.kr.huichan.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = {-1, -1, -1, -1};
        char[] charList = {' ', ' ', ' ', ' '};
        int point = 0, tmp = 0, count = 10, strike = 0, ball = 0;

        while (charList[3] == ' ') {
            tmp = (int) (Math.random() * 10);
            for (int j = 0; j < numList.length; j++) {
                if (tmp == numList[j]) break;
                else if (j == (numList.length - 1) && tmp != numList[j]) {
                    numList[point] = tmp;
                    charList[point] = (char) (tmp + 48);
                    point++;
                }
            }
        }

        while(count > 0) {
            Boolean condition = true;
            strike = 0;
            ball = 0;
            
            System.out.print(count + "회 남으셨습니다.\n4자리 숫자를 입력하세요: ");
            String stringResult = sc.nextLine();
            char[] result = stringResult.toCharArray();
            if (stringResult.length() == 4) {
                for (int i = 0; i < 4; i++) {
                    if ((int) result[i] < 48 || (int) result[i] > 57) {
                        condition = false;
                    }
                }
            } else {
                condition = false;
            }
            
            if (condition == false) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            for (int j = 0; j < 4; j++) {
                if (charList[j] == result[j]) {
                    strike++;
                } else {
                    for (int k = 0; k < 4; k++) {
                        if (charList[k] == result[j]) {
                            ball++;
                        }
                    }
                }
            }

            if (strike == 4) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("아쉽네요. " + strike + "S " + ball + "B 입니다.");
                count--;
            }
        }
    }
}
