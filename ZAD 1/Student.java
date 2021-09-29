package com.example.students;

public class Student {
    String name;
    String age;
    String klasa;
    String height;
    String school;

    public Student(String name, String age, String klasa, String height, String school) {
        this.name = name;
        this.age = age;
        this.klasa = klasa;
        this.height = height;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String name) {
        this.school = school;
    }

}
