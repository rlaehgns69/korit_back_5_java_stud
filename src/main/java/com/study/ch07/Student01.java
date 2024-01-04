package com.study.ch07;

public class Student01 {
    // 이름
    // 나이
    // 주소
    String name;
    int age;
    //        String address;
    final String address;

    // 생성자 constructor
    // args(arguments) 매개변수 값

    // NoArgsConstructor
//    Student01() {
//        address = " ";
//    }


    // AllArgsConstructor
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor
    Student01(String address) {
        this.address = address;
    }

//    Student01(String name) {
//        this.name = name;
//    }

}
