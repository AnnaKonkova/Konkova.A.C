package ru.vsuet.fruits.store;

import ru.vsuet.fruits.domain.Box;
import ru.vsuet.fruits.domain.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static Storage instance;
    public static Storage getInstance(){
        if(instance==null){
            instance =new Storage();
        }
        return instance;
    }
    public List<Box> boxes;
    public Storage(){
        boxes= new ArrayList<>();
        initBoxes();
    }

    private void initBoxes() {
        Fruit f1 =new Fruit(1L,"appl1",100);
        Fruit f2 =new Fruit(2L,"appl2",100);
        Fruit f3 =new Fruit(3L,"appl3",100);
        Fruit f4 =new Fruit(4L,"appl4",100);

        Box b1 =new Box(1,"box 1",List.of(f1,f2));
        Box b2 =new Box(2,"box 2",List.of(f3,f4));
        boxes.add(b1);
        boxes.add(b2);
    }
}
