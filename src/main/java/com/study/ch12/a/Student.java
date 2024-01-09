package com.study.ch12.a;

public class Student {
    private String name;
    private String address;

    // default 동일 패키지에서만
    // protected 상속
    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // 규칙 set변수명
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }
    // 외부 접근 제한
    // 이클래스에서만 사용
    private int add(int a, int b){
        return a + b;
    }

}
