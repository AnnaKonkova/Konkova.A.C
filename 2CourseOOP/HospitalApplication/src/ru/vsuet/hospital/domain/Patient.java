package ru.vsuet.hospital.domain;

import java.util.Objects;

public class Patient {
    private Long id;
    private String fuulName;
    private int age;
    private String gender;


    public Patient(Long id, String fuulName, int age,String gender) {
        this(fuulName, age,gender);
        this.id = id;
    }

    public Patient(String fuulName, int age,String gender) {
        this.fuulName = fuulName;
        this.age = age;
        this.gender =gender;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFuulName() {
        return fuulName;
    }

    public void setFuulName(String fuulName) {
        this.fuulName = fuulName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient fruit = (Patient) o;
        return Objects.equals(id, fruit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
