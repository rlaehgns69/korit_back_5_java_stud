package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    // main에서 throws JVM예외
    public static void main(String[] args) {

            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("김도훈").build());
            members.add(Member.builder().name("김도1").build());
            members.add(Member.builder().name("김도2").build());
            members.add(Member.builder().name("김도3").build());

            MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }
}
