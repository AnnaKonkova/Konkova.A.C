package ru.vsuat.paradigm.oop;

public abstract class Shape {

    protected ShapeType type;
    public Shape(ShapeType type){
        this.type=type;
    }
    public ShapeType getType(){
        return type;
    }
    public abstract int square();
}
