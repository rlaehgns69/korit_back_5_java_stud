package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("김도1");
        nameList.add("김도2");
        nameList.add(null);
        nameList.add("김도4");
        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if (name.equals("김도4")) {
                    System.out.println("김도4를 찾음!!!");
                }
            }
        } catch(NullPointerException e) {
            e.printStackTrace();
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("이거는 무조건 실행됨");
        }
        System.out.println("프로그램 정상 종료");
        // runtime 실행중(런타임 엑셉션)
        // 1.컴파일전(문법상 문제)
        // 2.컴파일후(문법상으로는 문제가 없다.) 런타임 엑셉션

    }
}
