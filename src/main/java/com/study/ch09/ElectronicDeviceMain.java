package com.study.ch09;

// 샹속 받아서 재정의 사용 가능한가? (원형 분석)
public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];
        // electronicdevice 상속받음 컴퓨터 스마트폰
        // 사용할 수 있는 멤버 개수 제한 부모사용가능한 것만 사용.(제한됨.)
        for (int i = 0; i < electronicDevices.length ; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone() ;
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        // 메서드의 재정의 우선 (메소드 오버라이딩)
        // System.out.println();
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        System.out.println();
        // 인스턴스 실제 객체
        // 자바17부터 instanceof 사라짐. 클래스 클래스 클래스명.클래스 서로가 같은지 비교 가능
        for(int i = 0; i< electronicDevices.length; i++){
            if(electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if(electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }

//        ElectronicDevice electronicDevice = new ElectronicDevice();
//        SmartPhone smartPhone = new SmartPhone();
//        ElectronicDevice electronicDevice2 = smartPhone;
//
//        electronicDevice.showDeviceState();
//        smartPhone.showDeviceState();
//
//        electronicDevice2.


//        for(int i = 0; i < computers.length; i++) {
//            computers[i].setPowerOn();
//        }
    }
}
