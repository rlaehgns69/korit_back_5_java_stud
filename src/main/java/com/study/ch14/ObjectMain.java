package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김도훈","부산진구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("김도훈","부산진구");

        // 다른패키지 생성하면 안나옴.
        System.out.println(objectTest.equals(objectTest1)); // 값
        System.out.println(objectTest == objectTest1);

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());

        System.out.println(ObjectTest.class);
// 값만 비교하는거(equals) 찍어낸 틀이 달라도 값이 같으면 같다.
        System.out.println(objectTest.hashCode()); // 16진수로
        System.out.println(objectTest1.hashCode());
    }
}
