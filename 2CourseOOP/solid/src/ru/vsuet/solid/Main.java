package ru.vsuet.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Diagnosable> components=List.of(new Motherboard(),new CPU());
        Diagnostician diagnostician=null;
        Computer computer = new Computer(diagnostician);
        computer.start();
    }
}