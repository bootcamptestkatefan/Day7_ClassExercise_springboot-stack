package com.tw.apistackbase.controller;

public class Employee {

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String name;
    private int age;
    private String gender;
    private String id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }


}