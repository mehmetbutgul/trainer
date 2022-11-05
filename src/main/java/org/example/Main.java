package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyArrayList listOfStudents= new MyArrayList(10);
        listOfStudents.add("mehmet");
        listOfStudents.add("ahmet");
        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
        System.out.println(listOfStudents.get(5));

    }
}