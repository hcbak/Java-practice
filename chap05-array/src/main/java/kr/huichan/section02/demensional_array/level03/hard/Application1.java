package main.java.kr.huichan.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static int getNumber(char x) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print((x == 'x' ? "가로" : "세로") + " 행의 수를 입력하세요: ");
            num = sc.nextInt();
            if (num > 10 || num < 1) {
                System.out.println("반드시 1 ~ 10 범위의 정수를 입력해야 합니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int x = getNumber('x');
        int y = getNumber('y');
        char[][] myArray = new char[y][x];
 
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = (char) ((Math.random() * 26) + 65);
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(String.format("%2s", myArray[i][j]));
            }
            System.out.println();
        }
    }
}
