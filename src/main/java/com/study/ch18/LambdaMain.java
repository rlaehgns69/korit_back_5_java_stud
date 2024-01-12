package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {

        // 람다식 (함수안에 함수)
        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        };
        start.run();

        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();
        System.out.println(a);

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        Consumer<String> setName = name -> {
            String newName = name + " 님";
            System.out.println(newName);
        };
        setName.accept("김도훈");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("김도훈");

        // strList.forEach(action);
        strList.forEach(str -> System.out.println(str));

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num ->{
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numList.add(i+1);
        }
        System.out.println(numList);

        // stream 빠꾸 불가
        // list -> stream -> 새로운 스트림(조건에 해당하는) .collect 콜렉션으로 바꿔라 List 자료형으로
        // Predicate(filter안)
        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList); // filterFx

        // .stream newList(2, 4, 6, 8, 10)->
        // map 반복 set map
        // Function 매개변수 return까지 있는 거
        // 기존자료 *2 해서 (전부다 곱하고 싶을 때) 어떤 하나의 값을 받아서 연산처리를 한다.
        List<Integer> newList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
