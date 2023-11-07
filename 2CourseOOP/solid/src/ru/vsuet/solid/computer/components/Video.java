package ru.vsuet.solid.computer.components;
import ru.vsuet.solid.Diagnosable;
public class Video extends Diagnosable {
    @Override
    public void test(){
        System.out.println("vidio is working...");
    }
}
