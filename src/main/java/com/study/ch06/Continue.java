package com.study.ch06;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if(i % 2 != 0){
                continue;
            }
            System.out.println("for문 마지막");
            System.out.println("for문 마지막");
            System.out.println("for문 마지막");
            System.out.println("for문 마지막");
        }
    }
}
