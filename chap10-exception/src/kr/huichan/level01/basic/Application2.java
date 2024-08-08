package kr.huichan.level01.basic;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성): ");
        String birthday = sc.nextLine();
        
        try { new InvalidAgeException(birthday); }
        catch(InvalidAgeException e) { System.out.println("만 20세 미만은 입장 불가입니다."); }
        catch(DateTimeParseException e) { System.out.println("날짜 양식을 잘못 입력하셨습니다."); }
    }
}
