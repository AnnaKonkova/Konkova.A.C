package ru.vsuet.annotations;

public class Person {
    private String name;
    @JsonIgnore
    private int age;
    private String address;

    public Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
