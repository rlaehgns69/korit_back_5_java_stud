package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendData <T>  {
    private int code;
    private T data;
// 제네릭 일반자료형 x 클래스, 참조자료형 써야됨.
    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
