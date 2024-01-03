package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.print("번호 선택: ");
        num = scanner.nextInt();

        switch (num){
            case 0:
                System.out.println("0 선택");
                break;
            case 1:
                System.out.println("1 선택");
                break;
            case 2:
                System.out.println("2 선택");
                break;
            default:
                System.out.println("아무것도 선택x");
                break;
        }
    }
}
