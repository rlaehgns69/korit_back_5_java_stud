package com.study.ch08.car;

public class Car {
    String model;
    String color;

    // NoArgsConstructor
    Car() {

    }
    // 비활 생성자 만들어지면 All이든 Required든 만들어줘야 함.
    // 아무것도 없을 때 사용 가능
    
    
    // AllArgsConstructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    } // Car 자신이 가지고 있는 값에 대입 this

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' + // \', "'" -> '
                ", color='" + color + '\'' + // """" 이스케이프 큰따옴표안에 큰따옴표
                '}';
    }
}
