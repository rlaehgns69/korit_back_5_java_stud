package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() {
        Car car = new Car("아반떼", "검은색");
        //car.CarBuilder;
        // (new Car()).new CarBuilder();

        return new Car.CarBuilder();
        // new CarBuilder();

    }

    
    // 생성하니까 호출 가능한 상태
    // static 없으면 생성해서야 사용가능 new Car()
    public static class CarBuilder {
        private String model;
        private String color;


        // 내부 클래스
//      Car.CarBuilder carBuilder = Car.builder();
//        Car car = Car.builder().build();
        
        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

    }
}
