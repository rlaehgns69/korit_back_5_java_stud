package com.study.ch05;

public class If02 {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        if (x == 0 || y==0){
            System.out.println("오류");
        } else if (x > 0 && y > 0) {
            System.out.println("제1사문면");
        } else if(x > 0 && y < 0) {
            System.out.println("제2사분면");
        } else if(x < 0 && y < 0) {
            System.out.println("제3사분면");
        } else {
            System.out.println("제4사분면");
        }

        if (x < 0) {
            if (y > 0) {
                System.out.println("제2사분면");
            }
        }
        else if (x < 0) {
            if (y < 0) {
                System.out.println("제3사분면");
            }
        }
        else if (x < 0) {
            if(y < 0) {
                System.out.println("제4사분면");
            }
        }
        else
            System.out.println("오류입니다.");
    }
}
