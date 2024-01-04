package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        //생성자 호출 - 함수 호출
        // new 해서 생성하면 무조건 주소값 리턴 자료x
        Computer computer1 = new Computer(); // 생성
        // 컴퓨터자료형을 대입(값) - 주소 값(실제 데이터가 있는 위치)
        Computer computer2 = new Computer("노트북"); // 생성
        // 힙메모리 동적할당
        // 똑같은 이름의 클래스 패키지 경로로 구분(저장된 주소 같은 이름 사용가능)
        System.out.println(computer1); // 할당된 주소(실제 존재-인스턴스의 주소)
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        //생성된 인스턴스안에 변수와 함수로 .으로 접근 각각의 메모리안에 들어있음.
        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.disk = "HDD";
        computer2.disk = "SDD";
        // 가장 기본적인 클래스 사용법
        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";
        //*주소

        // 틀이면서 자료형 -생성(메모리 할당)

        // 늘릴 수 없는 메모리 (딱 정해져 있는 메모리)-정적 메모리 (스택)
        // 프로그램 실행 중에 메모리를 빌려 쓸거다.(늘리고 줄이는 메모리)-동적 메모리(클래스)

        // 동적 메모리 할당 new 키워드(다른 언어에서도 마찬가지)
        // 객체 생성 new => 동적 메모리 할당
    }
}
