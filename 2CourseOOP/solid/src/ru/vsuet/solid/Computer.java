package ru.vsuet.solid;

public class Computer {
    private final Diagnostician diagnostician;

    public Computer(Diagnostician diagnostician){
        this.diagnostician = diagnostician;
    }
    public void start(){
        System.out.println("Starting...");
        if (diagnostician != null) {
            diagnostician.diagnose();
        }
        System.out.println("ok. Started.");
    }
}
