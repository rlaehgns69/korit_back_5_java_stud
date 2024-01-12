package com.study.ch19;

public class StBuilderMain {
    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = Student.builder();
        Student student = studentBuilder
                .age(10)
                .name("김순이")
                .address("부산진구")
                .build();

        System.out.println(student);
    }

}
