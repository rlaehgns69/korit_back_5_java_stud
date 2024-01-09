package com.study.ch12.a;

public class AMain {
    public static void main(String[] args) {
        Student student = new Student(); // private 생성자 같은패키지라도 클래스가 아니라서 불가
        student.setName("김도훈");
        System.out.println(student.getName());

        student.setAddress("부산진구");
        System.out.println(student.getAddress());
    }

}
