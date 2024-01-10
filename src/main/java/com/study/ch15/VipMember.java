package com.study.ch15;

public class VipMember extends Member {
    private final String GRADE = "VIP";

    // 멤버 AllArg
    // vip생성 부모가 값 가진다.
    public VipMember(String name, String phone) {
        super(name, phone);
    }
}
