package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // collection 상속x add x put

//        map.put("1번학생", "김도훈");
//        map.put("2번학생", "김도1");
//        map.put("3번학생", "김도2");
//        map.put("4번학생", "김도3");
        // 클래스의 형태 .get 객체주소
        map.put("username", "rlaehgns");
        map.put("password", "1234");
        map.put("name", "김도훈");
        map.put("email", "rlaehgns69@naver.com");
        // 키값이 해쉬셋과 동일
        // 순서x 중복허용 o (키값이 다름)
        System.out.println(map);
        System.out.println(map.get("3번학생"));
    }
}
