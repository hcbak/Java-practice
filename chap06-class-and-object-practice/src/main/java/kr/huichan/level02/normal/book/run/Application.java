package main.java.kr.huichan.level02.normal.book.run;

import main.java.kr.huichan.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main (String[] args) {
        BookDTO book1 = new BookDTO();
        book1.printInfomation();

        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        book2.printInfomation();

        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInfomation();
    }
}
