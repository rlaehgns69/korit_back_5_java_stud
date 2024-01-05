package com.study.ch08;

public class TestB01 {

    // int[] return nums
    void add(int[] array, int x, int y) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == 0) {
                array[i] = x + y;
                break;
            }
        }
    } // 배열은 여기서 사라진다.
    void showArrayData(int[] array) {
        System.out.println("배열 값 확인");

        for(int i = 0; i< array.length; i++) {
            System.out.println("index["+ i +"]> " + array[i]);
        }

        System.out.println();
    }
}
