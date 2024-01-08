package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

//      Car car1 = null;
//      Car car2 = null;
//      Car car3 = null; // 자동차 3개 생성
        // 배열 따로 서비스, 레포지토리 따로 각각생성
        Car[] cars =new Car[3];
        // 배열 생성후 레포지토리 (순서)

        // 주소를 준거
        CarRepository carRepository = new CarRepository(cars);
        // carRepository.cars = cars; 외부 주입 결합도가 높다.(의존성이 높다.) 레포지토리에서 배열 생성하고 의존성 주입
        // 순서 레포지토리 다음 서비스
        // CarService carService = new CarService(new carRepository(new car[3]));
        CarService carService = new CarService(carRepository); // 서비스안에 레포지토리 만들면 결합도가 낮다.
        // carService.carRepository = carRepository;  외부에서 주입 결합도가 높다.(의존성이 높다.) 서비스에서 레포지토리 만들어줌
        // 언제든지 카레포지토리는 다른 거로 변경 가능; 부품화
        //  Car car = new Car(model, color); 레포지토리를 생성할때 주입 엔티티(정보를 담는 클래스) // entity

        while(loopFlag) { // loop 밖 생성
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine(); // 무한루프 실행 중에 입력을 기다림.
            
            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중...");
                loopFlag = false; // break, flag 사용 구분
            } else if("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 등록 페이지 >>>");


                String model = null;
                String color = null;

                // Repository영역 비어있는지 확인(서비스) 데이터를 가지고 온다.(레포지토리) 배열가지고 하는 거 Repository

                if(carService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue; // 함수x
                }

                // main에 있어도 됨. 뷰로 뺴기(서비스로 뺄 필요 굳이)
                System.out.print("모델명 >>>"); // 공백, 취소 생략
                model = scanner.nextLine();
                System.out.print("색상 >>>");
                color = scanner.nextLine(); // 자동차 속성

//              int emptyIndex = 0;
//              for(int i = 0; i < cars.length; i++) {
//                  if(cars[i] == null){
//                      emptyIndex = i;
//                      break;
//                  }
//              }
//              cars[emptyIndex] = new Car(model, color);
//              System.out.println(cars[emptyIndex].toString());
                
                // loop 생성 대입 다시 못쓴다. 지역을 전역으로 만듬 car1값을 밖에 저장하고(전역) 조회(지역)로 뺼 수 있다.
                // 내부 Car car 생성자(지역) -> 외부 Car car1생성 car1에 대입(전역)
                // 전역, 지역 벤다이어그램으로 이해
                // Car car = new Car(model, color); // 생성자 한번에

                // car생성
                Car car = new Car(model, color);
                //System.out.println(car.toString());

                // append
//                for(int i = 0; i < cars.length; i++) {
//                    if(cars[i] == null){
//                        cars[i] = car;
//                        break;
//                    }
//                }
                carService.append(car);


                // car1 = new Car(model, color);
                // car1만 생성 car2 생성 불가 (변수명은 바꿀 수 없다.) 배열을 사용
                // cars[0] = new Car(model, color);
                // System.out.println(cars[0].toString());

                // car.model = model;
                // car.color = color;
                // System.out.println("model = " + car1.model + " color = " + car1.color);
                // System.out.println(car1.toString());

            } else if("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                carService.printCarList();
                // System.out.println(car1.toString());
//                for (int i = 0; i < cars.length ; i++) {
//                    System.out.print("[" + i + "] > ");
//                    if(cars[i] == null) {
//                        System.out.println("x");
//                        continue;
//                    }
//                    System.out.println(cars[i].toString());
//                } // null인 경우 건너뛰어야 된다.

            }
            else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
