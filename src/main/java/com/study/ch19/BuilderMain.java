package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder =Car.builder();
        Car car2 = carBuilder.color("빨강").model("아반떼").build();

        Car car = Car.builder().model("아반떼").color("빨강").build();

        System.out.println(car);

        // Mebmer member = Member.builder().phone("01064357321").name("김도훈").build();
        Member member = new Member("김도훈" ,"01064357321");
        // Member에 @Builder가 되어있는데 AllArgs사용가능
//        // .builder 스태틱 메서드 (생성없이 접근)
//        Car car = Car.builder() // 객체 생성
//                .model("아반떼") // 값 생성
//                .color("빨강")  // 값 생성
//                .build(); // 생성


        
    }
}

