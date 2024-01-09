package com.study.ch12.b;

import com.study.ch12.a.Student;

public class BMain {
    public static void main(String[] args) {
        // default는 동일 패키지
        Student student = new Student();
        student.test();
    }
}
