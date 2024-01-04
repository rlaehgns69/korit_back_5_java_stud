package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user01 = new User01("aaa", "1234");
        User01 user02 = new User01("bbb", "1234", "김훈도", "rlaehgns5766@naver.com");

        user01.showInfo();
        System.out.println("===");
        user02.showInfo();
        System.out.println("===");
        
        
        user01.name = "김순도";
        user01.email = "nknkfd5766@naver.com";

        user01.showInfo();



    }
}
