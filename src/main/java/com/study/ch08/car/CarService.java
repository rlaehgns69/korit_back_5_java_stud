package com.study.ch08.car;

public class CarService {
    // CarRepository carRepository = new CarRepository(); 결합도가 높다.
    CarRepository carRepository; //변수

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    // 변수 for문 emptyCount는 0인지 확인하고 계속 continue는 함수로 못뺀다.
    boolean isFull() {
//        int emptyCount = 0;
//        for (int i = 0; i < carRepository.cars.length; i++) {
//            if (carRepository.cars[i] == null) {
//                // main안에 있는 배열
//                emptyCount++;
//            }
//        }
        return carRepository.getEmptyIndex() == -1;
    }
    // add , append 쌓임. appendCar car.append
    void append(Car car){
        // append까지 왔으면 (이미전에)비었는지 확인
        carRepository.insert(car);
//        for(int i = 0; i < cars.length; i++) {
//            if(cars[i] == null){o
//                cars[i] = car;
//                break;
//            }
//        }
    }
    void printCarList() {
        Car[] cars = carRepository.getCarDatas();;
        if(cars.length == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for(int i= 0; i < cars.length; i++){
            System.out.println(cars[i].toString());
        }
    } // nullPointer exception 방지 null이 들어가는 거 방지
}
//  CarService(CarRepository carRepository) {
//      this.carRepository = carRepository;
//  }

// 위에 레포지토리 있어서 각각 접근 바로 가능.
//  void tets1() {
//      Car[] cars = carRepository.cars;
//  }
//  void test2() {
//      Car[] cars = carRepository.cars;
//  }


