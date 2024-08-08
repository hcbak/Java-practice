package kr.huichan.level01.basic;

import java.time.*;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() { super(); }

    public InvalidAgeException(String birthday) throws InvalidAgeException {
        LocalDate start = LocalDate.parse(birthday);
        LocalDate end = LocalDate.now();

        if ((start.getYear() + 20 <= end.getYear()) && (start.getDayOfYear() < end.getDayOfYear()))
            System.out.println("입장하셔도 됩니다.");
        else
            throw new InvalidAgeException();
    }
}
