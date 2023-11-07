package ru.vsuet.fruits.domain;

import java.util.List;

public class Fruit {
    private long id;
    private String name;
    private int weight;


    public Fruit(long id, String name, int weight) {
        this(name,weight);
        this.id = id;
    }
    public Fruit( String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }



}
