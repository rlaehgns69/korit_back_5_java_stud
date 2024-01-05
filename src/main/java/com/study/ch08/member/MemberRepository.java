package com.study.ch08.member;

public class MemberRepository {                     // 서비스상위 MemberService {
// main 메서드에서  Member[] members =new Member[]  Service(Member[] members) add(Member[] members
//  MemberService ms = new MemberService(); ms.add(members);    MemberRepository mr = new MemberRepository();
    // MemberRepository) insert(Member[] members            insert(Members[] member)

// main mr ms ms.add(mr);   --- MemberService add(MemberRepository mr) mr.insert === MemberRepository Member[] member =
//new Member();  insert{ members[] = new Member();}

    Member[] members = new Member[3];

    int insert(Member[] members, Member member) {
        // members[0]=null;
        for (int i = 0; i < members.length; i++) {
            if(members[i] == null) {
                members[i] = member;
                break;
            }
            // insert 함수가 끝나면 멤버가 날라간다.
        }
        //members[0] = member;
        // 첫번째 회원등록할때 마다 addMember -> insertMember Repository insert 0번 인덱스만 넣게 되는 문제
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;
    }
}
