package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        // 리턴자료형을 함수로
        while(true) {
            System.out.print(label+"(입력취소: exit) >>> ");
            value= scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }
        }
        return value;
    }


    boolean addMember(Member[] members) {
        String code =null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원등록 >>>");
        // 다른 상황 null 들어감 scanner.nexLine은 null이 들어갈 수 없다.
        // 저번시간에 NullPointerException
        // isBlank를 쓰려면 무조건 null이 x 띄워쓰기 포함/공백 체크용 메서드
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }
        // 코드 중복이 되지만
        // map, collection
        // 종료시키고 나올라면 리턴이 있어야되는데 굳이 함수로 빼면 리턴을 해줘야된다.
        // addMember를 빠져나오려면 리턴이 있어야된다. 외부로 뺄 수 없다. 조건이 있어야된다.
        // address도 리턴해야되고 문자열도 리턴해야됨. 트룬지 폴스인지 값을 가져와야된다.
        // 2개묶어서 해야된다.
        // map을 활용하면 하나로 묶어서 가져 와야된다.
        // 클래스를 사용할 수 있지만 굳이 그렇게 안함.

        Member member = new Member(code, name, Integer.parseInt(age), address);

        MemberRepository memberRepository = new MemberRepository();

        return memberRepository.insert(members, member) > 0;
    }
}
