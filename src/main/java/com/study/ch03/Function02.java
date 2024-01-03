package com.study.ch03;

public class Function02 {

    // 1. 매개변수 x, 리턴 x
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    // 2. 매개변수 o, 리턴 x
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    // 오버로딩: 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의가 가능하다.
    public static void fx02(String b, int a) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + b);
        System.out.println("나이: " + a);
        System.out.println();
    }

    // 3. 매개변수 x, 리턴 o
    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }
    // 4. 매개변수 o, 리턴 o
    public static String fx04(String name, int age) {
        return name +", " + age;
    }

    public static void main(String[] args) {
        fx01();

        fx02(5, "김도훈");
        fx02("김도훈", 5);
        //int num = fx03();
        System.out.println(fx03());

        String result = fx04("김도훈", 26);
        System.out.println(result);

        // System.out.println(fx04("김도훈", 26));
    }
}
