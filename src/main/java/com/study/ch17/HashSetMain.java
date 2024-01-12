package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");

        System.out.println(nameList);

        // Set 순서없다 중복 x 수정 x
        // 중복제거할때 addAll
        HashSet<String> names = new HashSet<>();
        // 클래스가 HashSet 글자에 대한 해쉬값
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        // 해당리스트 인덱스부터 값을 넣어라.
        newNameList.addAll(names);
        //System.out.println(newNameList.get());
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // return 0;
                return Objects.hash(o1)-Objects.hash(o2);
            }
        });


        // 중복x
        // set 중복제거활용

        String findName = null;
        for(String name: names) {
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }
        System.out.println(findName);
//        for (int i = 0; i < names.size(); i++) {
//
//        }



//        System.out.println(names);
//
//        System.out.println(Objects.hashCode("김준일"));
//        System.out.println(Objects.hashCode("김준이"));
//        // 해쉬 알고리즘.
//        System.out.println(Objects.hashCode("김준삼"));
//        System.out.println(Objects.hashCode("김준사"));
//        System.out.println(Objects.hashCode("김준오"));
    }
}
