package ru.vsuet.solid;

import java.util.List;

public class Diagnostician {

    private final List<Diagnosable> components;

    public Diagnostician(List<Diagnosable> components) {
        this.components = components;
    }

    public boolean diagnose(){
        components.forEach(Diagnosable::test);
        return false;
    }

}
