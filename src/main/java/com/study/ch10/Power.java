package com.study.ch10;

// 인터페이스 기본적으로 모든 메서드가 추상메서드.(abstract)생략
// 인터페이스, 추상클래스 -> 추상클래스 일반메서드 ,abstract 메서드 가질 수 있음./ 인터페이스 기본적으로 추상메서드
public interface Power {
    // errorCode
    String ERROR_CODE = "-9999";

    boolean powerState = false; // 초기화 인터페이스는 무조건 상수선언
    void setPowerOn();
    void setPowerOff();
    
    // default 일반 메서드
    // 추상클래스와 반대
    // 인터페이스 다중 상속
    default void test() {
        
    }
}

// System, Integer static
// interface Power.ERROR_CODE 사용 가능
// public 붙어져있는 외부 거 사용 가능 ConstanMain.main(null)
// 생성없이 호출 static static안에서 일반 메서드 사용하려면 생성해서 사용해야 함.