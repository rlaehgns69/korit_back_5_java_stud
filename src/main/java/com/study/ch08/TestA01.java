package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        // 클래스는 메모리에 존재해야 사용 가능
        // 클래스(객체)는 변수와 메서드를 가진다(상태와 기능)
        // 객체는 생성되어야 변수와 기능을 사용 가능함.
        TestB01 bClass = new TestB01();
        bClass.add(nums, num, num2);
        bClass.showArrayData(nums);

        bClass.add(nums, 20, 40);
        bClass.showArrayData(nums);
    }
}
