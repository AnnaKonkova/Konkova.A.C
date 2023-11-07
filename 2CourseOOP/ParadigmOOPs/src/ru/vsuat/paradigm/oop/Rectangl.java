package ru.vsuat.paradigm.oop;

public class Rectangl extends Shape {
    private final int width;
    private final int height;

    public Rectangl(int width, int height) {
        super(ShapeType.RECTANGL);
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public int square() {
        return width*height;
    }
}
