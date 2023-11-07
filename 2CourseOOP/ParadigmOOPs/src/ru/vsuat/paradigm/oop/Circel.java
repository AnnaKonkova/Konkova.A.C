package ru.vsuat.paradigm.oop;

public class Circel extends Shape {
    private final int radius;

    public Circel(int radius) {
        super(ShapeType.CIRCLE);
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }
    @Override
    public int square() {
        return (int) Math.PI*radius*radius;
    }
}
