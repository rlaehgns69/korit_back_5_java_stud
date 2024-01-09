package com.study.ch09;

// 상속 클래스 합치기
public class Computer extends ElectronicDevice{
//    boolean powerState;
    String  cpu;
    int ram;

//
//    void setPowerOn() {
//        powerState = true;
//    }
//
//    void setPowerOff() {
//        powerState = false;
//    }
//
//    void showDeviceState() {
//        System.out.println("전원 상태: " + ((powerState) ? "켜짐." : "꺼짐" ));
//    }

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }
//  재정의 - 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의 할 수 있다.
//  자료형, 메서드명 함수명 같음.(오버라이딩) 안에 동작만 다름.
//  업캐스팅 가능.
    void showDeviceState() {
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }
}
