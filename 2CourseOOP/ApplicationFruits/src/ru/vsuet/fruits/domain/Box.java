package ru.vsuet.fruits.domain;

import java.util.List;

public class Box {
    private long id;
    private String title;

    private List<Fruit> fruits;


    public Box(long id,String title, List<Fruit> fruits) {
        this.id=id;
        this.title = title;
        this.fruits = fruits;
    }
    public Box(String title, List<Fruit> fruits) {
        this.title = title;
        this.fruits = fruits;
    }
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public List<Fruit>getFruits(){
        return fruits;
    }

}
