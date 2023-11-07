package ru.vsuet.solid;

import java.util.List;

public abstract class Diagnosable {
    public boolean check(){
        System.out.println("diagn");
        return false;
    }
    public abstract void test();
}
