package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김도훈", 25));
        students.add(new Student("김도1", 25));
        students.add(new Student("김도2", 25));
        students.add(new Student("김도3", 25));

        System.out.println(students);

        Student s = new Student("aaa", 10);
        s.setAge(s.getAge()+1);

//      students.get(i).setAge(students.get(i).getAge()+1);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge()+1);
        }

        // 향상된 for
        for(Student student: students){
            student.setAge(student.getAge()+1);
        }


        System.out.println(students);
        students.forEach(student -> student.setAge(student.getAge() + 1));

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            Student student;
            student = new Student("김준일", 31);
            // 변수

            //studentArray[i] = new Student("김준"+i, 31 + i);
        }
        int i = 0;
        for(Student student: studentArray) {
            // 변수
            studentArray[i] = new Student("김준일", 25);
            i++;
        }
        // x
        // students.get(0) = new Student("김준일", 31);
        students.set(0,new Student("김준일", 31));


        for(Student student : studentArray) {
            System.out.println(student);
        }
    }
}
