package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedValue = null;

        while (true) {
            // 1-5-4-6-2-3
            System.out.println("회원관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");
            selectedValue = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedValue)) {
                break;
            } else if ("1".equals(selectedValue)) {
                int i = 0;
                String name = null;
                String address = null;

                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();

                members.add(i++, new Member(name, address));
                System.out.println("<< 등록이 완료 되었습니다. >>");


                /**
                 * [ 회원 등록하기 ]
                 *  이름 >> 김도훈
                 *  주소 >> 부산 부산진구
                 *  << 등록이 완료 되었습니다. >>
                 */

            } else if ("2".equals(selectedValue)) {
                /**
                 *  [ 회원 이름 수정하기 ]
                 *  수정할 회원의 이름을 입력하세요 >> 김도훈
                 *  해당 이름의 회원이 존재하지 않습니다.
                 *  주소 >> 부산 부샂진구 부암동
                 *   << 수정이 완료되었습니다. >>
                 */
            } else if ("3".equals(selectedValue)) {
                /**
                 *  [ 회원 주소 수정하기 ]
                 *  수정할 회원의 이름을 입력하세요 >> 김도후
                 *  주소 >> 부산 부산진구 부암동
                 *  << 수정이 완료되었습니다. >>
                 */

            } else if ("4".equals(selectedValue)) {
                String name = null;

                System.out.println("[ 회원 이름으로 조회하기]");
                System.out.print("조회할 회원의 이름을 입력하세요 >> ");
                name = scanner.nextLine();
                for(Member member: members) {
                    if(member.getName().equals(name)) {
                        System.out.println(members.toString());
                        break;
                    }
                }

                /**
                 *  [ 회원 이름으로 조회하기 ]
                 *  조회할 회원의 이름을 입력하세요 >> 김도후
                 *  Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 */


            } else if ("5".equals(selectedValue)) {
                /**
                 *  [ 회원 전체 조회하기 ]
                 *  MemberList 전체 반복 toString();
                 *  << 조회가 완료되었습니다.>>
                 */
                System.out.println(members.toString());
                System.out.println("조회가 완료되었습니다.");


            } else if ("6".equals(selectedValue)) {
                /**
                 *  [ 회원 이름으로 삭제하기 ]
                 *  삭제할 회원의 이름을 입력하세요 >> 김도후
                 *  삭제된 Member 객체의 toString();
                 *  << 삭제가 완료되었습니다. >>
                 */
            } else {
                System.out.println("다시 선택하세요");
            }

        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}




