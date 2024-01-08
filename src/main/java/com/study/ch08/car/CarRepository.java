package com.study.ch08.car;

public class CarRepository {
    // 변수가 있다면 required
    // 틀 초기화.
    // 메서드안에서는 초기화 하고 사용.
    final Car[] cars;
    // 후에 DB연결
    // All 이면서 Required
    CarRepository(Car[] cars) {
        this.cars = cars;
    }
//    int getEmptyCount() {
//        int emptyCount = 0;
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i] == null) {
//                // main안에 있는 배열
//                emptyCount++;
//            }
//        }
//        return emptyCount;
//    } getEmptyIndex생성 -1이면 비어있지 않다. isFull

    int getEmptyIndex() {
        for(int i= 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            } // 해당 index 함수 빠져나감.(break .쓸 필요 x)
        }
        return -1;
    }

    void insert(Car car) {  // ,int index
        cars[getEmptyIndex()] = car;
    }
    // 중간에 비어있는 공간 o

    //Car[] newCars
    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
            // 몇대 등록되어있는지(ex 1번 5번 2대)
        } // 배열 10개 1번 5번에 차가 들어있음.(2대)
        // 배열 생성 위해서는 크기가 정해짐.
        // 새로 등록(2개)
        // 0이면 안 만들어진다.
        Car[] newCars =new Car[carCount];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                // not null 새로 등록
                // 0, 1 그다음 인덱스에 넣어줘야한다.
                newCars[j] = cars[i];
                j++; // 0번 다음 for문 하나 위에서 carCount 2개 (비어있지않은 공간 2개) j=0, 1까지 증가
            }
        }
        // 기존 10개 중에서 차2개
        // 10개 새로운 배열 2개 옮겨서
        return newCars;
        // 10개 배열 1 5 배열 .string 나머지 불가
        // 실존 2개만 들고 옴. null이 있을 수 있음.
    }
}
