package observer.projects;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String task) {
        for(Observer observer : observers){
            observer.update(task);
        }
    }

    public void addTask(String task){
        System.out.println("Новая задача дабавлена" + task );
        notifyObservers(task);
    }
}
