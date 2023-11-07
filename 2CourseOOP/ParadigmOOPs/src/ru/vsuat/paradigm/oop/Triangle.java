package ru.vsuat.paradigm.oop;

public class Triangle extends Shape{
    private final int width;
    private final int height;

    public Triangle(int side,int height) {
        super(ShapeType.TRIANGLE);
        this.width = side;
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
        return width *height;
    }
}
