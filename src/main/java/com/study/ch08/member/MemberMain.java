package com.study.ch08.member;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        Member[] members = new Member[3];

        String selectedMenu = null;
        // "aaa" new String("aaa") String은 클래스

        while (true) {
            System.out.println("[[ 회원 관리 프로그램 ]]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();

            // 문자열(객체)-클래스 연산 사용 가능

            // equalsIgnoreCase 대소문자 구분없이
            if("1".equals(selectedMenu)) {
                int emptyCount = 0;
                for (int i = 0; i < members.length ; i++) {
                    if(members[i] == null) {
                        emptyCount++;
                    }
                }
                if(emptyCount == 0){
                    System.out.println("회원을 등록할 수 없습니다.");
                    continue;
                }

                boolean responseData = memberService.addMember(members);
                if (responseData) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소>>>");
                }
                // "q".equals(selectedMenu) || "Q".equals(selectedMenu
            }else if("2".equals(selectedMenu)) {
                System.out.println("<<< 회원 전체 조회 >>>");
                for(int i = 0; i < members.length; i++) {
                    if(members[i]==null){
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(members[i].toString());
                }
            }else if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            }else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
//            switch(selectedMenu) {
//                case "1" :
//                    break;
//                case "q":
//                    break;
//                case "Q":
//                    break;
//                default:
//                    System.out.println("다시 선택하세요.");
//            }

        System.out.println();
        System.out.println("<<<<<<<< 프로그램이 종료되었습니다. >>>>>>>>");
    }
}
