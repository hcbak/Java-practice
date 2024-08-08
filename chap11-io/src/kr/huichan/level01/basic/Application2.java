package kr.huichan.level01.basic;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요: ");
        String originFileName = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요: ");
        String copyFileName = sc.nextLine();

        try (FileReader originFile = new FileReader(originFileName)) {
            try (FileWriter copyFile = new FileWriter(copyFileName)) {
                int value;
                String tmp = new String();
                while ((value = originFile.read()) != -1) { tmp += (char) value; }
                copyFile.write(tmp);
            } catch (IOException e) { System.out.println(e.toString()); }
        } catch (IOException e) { System.out.println("오류: " + originFileName + " (지정된 파일을 찾을 수 없습니다.)"); }
    }
}
