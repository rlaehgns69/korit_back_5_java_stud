package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {
        // 익명 클래스
        // 형태가 없는 구현 (이름x) 메모리할당 형태 구현
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10, 20));
        System.out.println(addition2.add(30, 40));

        // 람다식
        // 람다식 핵심 조건 -> 인터페이스 안에 딱 하나의 추상메서드만 정의되어 있어야 한다.
        // 단, 일반(default) 메서드는 여러개 정의되어 있어도 된다.
        Addition addition3 = (int x, int y) -> {
            return x + y;
        };

        System.out.println(addition3.add(50, 60));

        // 익명클래스와 동일
        // 1. 람다식의 매개변수 자료형은 생략할 수 있다. -> add함수명
        // 생성 및 재정의 동시에
        Addition addition4 = (x, y) -> {
            System.out.println("람다식으로 구현한 add메소드");
            return x +y;
        };
        // 위에꺼
        // 인터페이스에 정의된 add함수
        System.out.println(addition4.add(30, 60));

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 (한줄이면) 중괄호를 생략할 수 있다.
        // 단, return은 중괄호를 생략할 시에 같이 생략한다.
        Addition addition5 = (x, y) -> x + y; // return x + y; 인터페이스 Addition 의 리턴자료형 int
        Viewer viewer1 = (viewData) -> {
            System.out.println("화면 출력");
        };
        // 한줄만 실행할 때
        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        // 3. 매개변수가 1개면 매개변수의 괄호를 생략할 수 있다.
        Viewer viewer3 = viewData -> System.out.println("화면 출력");
        
    }
    
}
