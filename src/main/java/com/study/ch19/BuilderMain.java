package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder =Car.builder();
        Car car2 = carBuilder.build();

        Car car = Car.builder().model("아반떼").build();

        System.out.println(car);

//        // .builder 스태틱 메서드 (생성없이 접근)
//        Car car = Car.builder() // 객체 생성
//                .model("아반떼") // 값 생성
//                .color("빨강")  // 값 생성
//                .build(); // 생성


        
    }
}

