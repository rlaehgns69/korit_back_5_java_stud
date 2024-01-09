package com.study.ch10;
// 추상 클래스가 추상클래스를 상속 받으면 가능
// 재정의해서 사용 가능
// 두개의 클래스 상속 불가
public class RemoteController extends ElectronicDevice {
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}

//    Ctrl + I (implement) , +O(Override)
//    추상 클래스 x
//    @Override
//    void showDeviceState() {
//
//    }

