package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김도훈");
        arrayService.add("김도1");
        arrayService.add("김도2");
        arrayService.add("김도3");
        arrayService.add("김도4");
        arrayService.add("김도5");
        arrayService.add("김도6");

        System.out.println(arrayService.toString());

        System.out.println(arrayService.indexOf("김도훈"));
        arrayService.remove(3);
        System.out.println(arrayService.toString());
    }
}
