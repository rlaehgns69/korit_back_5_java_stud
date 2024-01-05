package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        // 변수의 이름은 유동적으로 변경할 수 없다. 메모리 주소 명명
        // 배열 인덱스는 변경 가능
        
        // 배열(Array)
        int[] numArray ;
        numArray = new int[3]; // 값(주소) 대입
        System.out.println(numArray);
        // 배열의 변수명 numArray
        // int 배열은 numArray []대괄호 안에 값 인덱스
        //[I 배열 int
        System.out.println(numArray[0]);

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);

    }

}
