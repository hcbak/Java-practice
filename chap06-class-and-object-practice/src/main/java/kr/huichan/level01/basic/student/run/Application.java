package main.java.kr.huichan.level01.basic.student.run;

import java.util.Scanner;

import main.java.kr.huichan.level01.basic.student.model.dto.StudentDTO;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int[] average = new int[10];
        char question = 'y';
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("학년: ");
            int grade = sc.nextInt();
            System.out.print("반: ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("국어점수: ");
            int kor = sc.nextInt();
            System.out.print("영어점수: ");
            int eng = sc.nextInt();
            System.out.print("수학점수: ");
            int math = sc.nextInt();
            sc.nextLine();

            students[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
            average[i] = (kor + eng + math) / 3;

            System.out.print("계속 추가할 겁니까? (y/n): ");
            question = sc.nextLine().charAt(0);
            if (question == 'y') {
                count++;
                continue;
            } else {
                break;
            }
        }

        for (int i = 0; i <= count; i++) {
            System.out.println(students[i].getInformation() + ", 평균=" + average[i]);
        }
    }
}
