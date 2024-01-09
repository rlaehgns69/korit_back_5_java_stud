package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
//    추상 클래스는 생성이 안됨.
//    ElectronicDevice electronicDevice1 = new ElectronicDevice();
//    익명 클래스
//    이름x (ED를 상속받아서 사용)
//    new RemoteController() 생성해서 변수에
//    new ElectronicDevice()는 없다. 전혀 새로운
      ElectronicDevice electronicDevice2 = new ElectronicDevice() {
          @Override
          void showDeviceState() {
              System.out.println("첫번째 기기 상태 확인");
          }
      };

      ElectronicDevice electronicDevice3 = new ElectronicDevice() {
          @Override
          void showDeviceState() {
              System.out.println("두번째 기기 상태 확인");
          }
      };
      // 일회용 추상메소드 상속 재정의
      // RemoteController 클래스와 동일 {}클래스 내용 상속
      // 추상클래스 구현만 가능하면 사용 가능 확장해서 람다로 사용.
      RemoteController remoteController = new RemoteController();
      ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
      electronicDevices[0] = electronicDevice2;
      electronicDevices[1] = electronicDevice3;
      electronicDevices[2] = remoteController;

        for (int i = 0; i < electronicDevices.length ; i++) {
            electronicDevices[i].showDeviceState();
        }

    }
}
