package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    // static 메서드에 접근하기위해 static
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();
    }
// 매개변수로 멤버 주소 전달
//    public static Member findMemberByName(ArrayList<Member> members, String name) {
//
//    }
    // 전체영역에 정의 됨.
    public static Member findMemberByName(String name) {
        for(Member member: members) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    public static void main(String[] args) {
//      ArrayList<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
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
            // 스캐너 멤버정보->멤버하나 -> 리스트 추가
            } else if ("1".equals(selectedValue)) {
//                int i = 0;
//                String name = null;
//                String address = null;
//
//                System.out.println("[ 회원 등록하기 ]");
//                System.out.print("이름 >> ");
//                name = scanner.nextLine();
//                System.out.print("주소 >> ");
//                address = scanner.nextLine();
//
//                members.add(i++, new Member(name, address));
//                System.out.println("<< 등록이 완료 되었습니다. >>");


                /**
                 * [ 회원 등록하기 ]
                 *  이름 >> 김도훈
                 *  주소 >> 부산 부산진구
                 *  << 등록이 완료 되었습니다. >>
                 */
                String name = null;
                String address = null;
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();
                // 정보 받았으니까 멤버객체 생성
                // AllArgs
                Member member = new Member(name, address);
                // 멤버리스트에 멤버추가
                // 이자체가 반복을 돌게 됨.
                members.add(member);
                System.out.println("<< 등록이 완료 되었습니다. >>");

            } else if ("2".equals(selectedValue)) {
                /**
                 *  [ 회원 이름 수정하기 ]
                 *  수정할 회원의 이름을 입력하세요 >> 김도훈
                 *  해당 이름의 회원이 존재하지 않습니다.
                 *  주소 >> 부산 부산진구  부암동
                 *   << 수정이 완료되었습니다. >>
                 */
                System.out.println("[ 회원 이름 수정하기 ]");
                String searchName = inputSearchName("수정할 회원의 이름을 입력하세요.");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 회원의 이름이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("업데이트 이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);

                System.out.println("수정이 완료되었습니다.");

            } else if ("3".equals(selectedValue)) {
                /**
                 *  [ 회원 주소 수정하기 ]
                 *  수정할 회원의 이름을 입력하세요 >> 김도후
                 *  주소 >> 부산 부산진구 부암동
                 *  << 수정이 완료되었습니다. >>
                 */
                System.out.println("[ 회원 주소 수정하기 ]");
                String searchName = inputSearchName("수정할 회원의 이름을 입력하세요.");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 회원의 주소이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("업데이트 주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);

                System.out.println("수정이 완료되었습니다.");

            } else if ("4".equals(selectedValue)) {
//                String name = null;
//
//                System.out.println("[ 회원 이름으로 조회하기]");
//                System.out.print("조회할 회원의 이름을 입력하세요 >> ");
//                name = scanner.nextLine();
//                for(Member member: members) {
//                    if(member.getName().equals(name)) {
//                        System.out.println(members.toString());
//                        break;
//                    }
//                }

                /**
                 *  [ 회원 이름으로 조회하기 ]
                 *  조회할 회원의 이름을 입력하세요 >> 김도후
                 *  Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 */
                String searchName = null;
                System.out.println("[ 회원 이름으로 조회하기 ]");
                searchName = inputSearchName("조회할 회원의 이름을 입력하세요");
//                System.out.print("조회할 회원의 이름을 입력하세요 >> ");
//                readName = scanner.nextLine();

//                Member findMember = null;
//                // 객체의 주소안에 이름 / 객체 자체 indexOf
//                // 멤버 하나하나 꺼내서 같은지
//                for(Member member: members) {
//                    if(member.getName().equals(readName)) {
//                        findMember = member;
//                        break;
//                    }
//                }

                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                // 다음 while 밑에꺼 실행 안됨.
                
                // null이 아니라면
                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다. >>");

                // System.out.println(findMember != null ? findMember: "해당 이름의 회원이 존재하지 않습니다.");


            } else if ("5".equals(selectedValue)) {
                /**
                 *  [ 회원 전체 조회하기 ]
                 *  MemberList 전체 반복 toString();
                 *  << 조회가 완료되었습니다.>>
                 */
                System.out.println("[ 회원 전체 조회하기 ]");
                // forEach 전체반복이니까 다꺼내줌.
                for(Member member: members) {
                    System.out.println(member);
                }
                System.out.println("조회가 완료되었습니다.");
//                System.out.println(members.toString());
//                System.out.println("조회가 완료되었습니다.");


            } else if ("6".equals(selectedValue)) {
                /**
                 *  [ 회원 이름으로 삭제하기 ]
                 *  삭제할 회원의 이름을 입력하세요 >> 김도후
                 *  삭제된 Member 객체의 toString();
                 *  << 삭제가 완료되었습니다. >>
                 */
                String readName = null;
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제할 회원의 이름을 입력하세요 >> ");
                readName = scanner.nextLine();

                Member findMember = null;
                // 객체의 주소안에 이름 / 객체 자체 indexOf
                // 멤버 하나하나 꺼내서 같은지
                for(Member member: members) {
                    if(member.getName().equals(readName)) {
                        findMember = member;
                        break;
                    }
                }
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                members.remove(findMember);
                // members.remove(members.indexOf(findMember))
                System.out.println(findMember);
                System.out.println("<< 삭제가 완료되었습니다. >>");

            } else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}




