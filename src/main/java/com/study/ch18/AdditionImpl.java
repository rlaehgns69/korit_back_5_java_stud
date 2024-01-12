package com.study.ch18;

public class AdditionImpl implements Addition {
    @Override
    public int add(int x, int y) {
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return x + y;
    }
    // 재정의 매개변수의 변수명 상관 x (자료형만 중요)
}
