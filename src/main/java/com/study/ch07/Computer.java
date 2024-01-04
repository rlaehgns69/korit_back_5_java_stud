package com.study.ch07;
// 클래스는 이걸 찍어낼 수 있는 틀
// new 인스턴스 찍어내면 변수와 함수 매번 찍어짐. Computer복사본이 생김.
public class Computer {
    String type;
    String cpu;
    String ram;
    String disk; //전역

    // void 없는 같은 형태(메서드 형태)
    // 클래스명이랑 같음.(대문자로 시작)
    // 변수명 함수명 소문자로 시작

    // 생성자
    // 1. 클래스의 이름과 동일하다.
    // 2. 메서드의 형태이다.

    // new Computer() 생성자 호출
    // 생성자 동작을 줄때

    // 생성자 오버로딩
    Computer() {
        type = "컴퓨터";
    }
    // 클래스는 예외적으로 전역에 쓰고 있어도 지역으로 쓸 수 있다.
    Computer(String type) {
        this.type = type;
    }


// public static (접근지정자) static 배우고
    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
        // 지역
        // 복사본 안에 cpu, 함수 '여기'안에 들어있는
        // 모든 클래스안에 정의한 함수들은 메서드 
        // 클래스안에 정의된 함수(메서드)
        // 자바는 클래스 메서드 클래스로딩 
    } 

}
