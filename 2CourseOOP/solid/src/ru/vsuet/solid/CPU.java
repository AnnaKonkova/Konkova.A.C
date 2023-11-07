package ru.vsuet.solid;

public class CPU extends Diagnosable {

    public boolean check(){
        System.out.println("Matherboard Diagnose");
        return false;
    }

    @Override
    public void test() {

    }
}
