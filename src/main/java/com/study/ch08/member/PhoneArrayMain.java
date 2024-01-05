package com.study.ch08.member;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        // 공간생성
        // Phone p1;
        // Phone p2;
        // Phone p3;
        phones[0] = new Phone("삼성", "갤럭시");
        phones[1] = new Phone("애플", "아이폰");
        phones[2] = new Phone("샤오미", "차이폰");

        for(int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}
