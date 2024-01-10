package com.study.ch14;

import java.util.Objects;
//import java.util.Scanner;

/**
 *  Object 클래스-자바 모든클래스는 Object클래스를 상속받는다.
 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // 주소가 같으면 true
        if (o == null || getClass() != o.getClass())
            return false; // 주소가 null이거나 같지않으면 (this생략)
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address); // s 도구 비교, 계산 등(메소드들의 집합)
        // Integer.parseInt static메서드 생성없이 사용
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}

//    public String toString() {
//        return super.toString();
    // return "toString 메소드 테스트";
//    }


//    public static void main(String[] args) {
//        util import lang 바로
//        Object o = new Object();
//        String str = new String();
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//    }

