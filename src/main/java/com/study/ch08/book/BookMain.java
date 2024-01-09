package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedValue =null;
        boolean loopflag = true;
        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);
        while(loopflag) {
            System.out.println("도서관리 프로그램");
            System.out.println("1.도서 등록");
            System.out.println("2.도서 조회");
            System.out.println("q.프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedValue = scanner.nextLine();
            if("q".equalsIgnoreCase(selectedValue)) {
                System.out.println("프로그램 종료 알림");
                loopflag = false;
            } else if("1".equals(selectedValue)) {
                System.out.println("<<< 도서 등록 페이지 >>>");

                String title = null;
                String contents = null;

                System.out.print("책 제목: ");
                title = scanner.nextLine();
                System.out.print("책 내용: ");
                contents = scanner.nextLine();

                Book book= new Book(title, contents);
                System.out.println(book.toString());
                for (int i = 0; i < books.length ; i++) {
                    if(books[i] == null){
                        books[i] = book;
                        break;
                    }
                }

            } else if("2".equals(selectedValue)) {
                System.out.println("<< 도서 조회 페이지>>");
                for (int i = 0; i < books.length ; i++) {
                    System.out.print("["+i+"]"+"=");
                    if(books[i] == null) {
                        System.out.println("x");
                        continue;
                    }
                    System.out.println(books[i]);
                }

            } else {
                System.out.println("다시 입력하세요");
            }

        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
