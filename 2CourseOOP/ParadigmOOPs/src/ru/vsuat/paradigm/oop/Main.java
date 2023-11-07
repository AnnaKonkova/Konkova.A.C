package ru.vsuat.paradigm.oop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        List<Shape> shapes = List.of(
                new Circel(10),
                new Circel(5),
                new Rectangl(3,5),
                new Triangle(4,6)
        );
        shapes.forEach(s-> System.out.println(s.getType() +":  "+s.square()) );
    }
}