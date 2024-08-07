package com.ohgiraffers.section01;

public class Member {

    private String name;
    private int age;

    public Member() {
    }

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
