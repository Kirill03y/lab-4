package com.example.lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupName;

    public Student(String name, String groupName) {
        this.name=name;
        this.groupName=groupName;
    }

    public String getName(){
        return name;
    }
    public String getGroupName(){
        return groupName;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Абрамов Кирило", "К20-3"),
                    new Student("Балашов Владислав", "К20-3"),
                    new Student("Бейнісович Ілля", "К20-3"),
                    new Student("Бровко Микита", "К20-3"),
                    new Student("Гарбуз Ігор", "К21-3"),
                    new Student("Гармашева Анастасія", "К21-3"),
                    new Student("Головко Микита", "К21-3"),
                    new Student("Дзюба Микита", "К21-3м"),
                    new Student("Кобрись Олександр", "К21-3м"),
                    new Student("Ковач Назар", "К21-3м")
            )
    );
    public static ArrayList<Student> getStudents(String groupName){
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students){
            if(s.getGroupName().equals(groupName)){
                stList.add(s);
            }
        }
        return stList;
    }
}

